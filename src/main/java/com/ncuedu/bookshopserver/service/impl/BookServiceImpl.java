package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.BookMapper;
import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.mapper.CateMapper;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.CateExample;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import com.ncuedu.bookshopserver.util.Define;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.ScriptSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.SearchResultMapper;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.aggregation.impl.AggregatedPageImpl;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 15:30
 **/
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;
    @Resource
    private BookVoMapper bookVoMapper;
    @Resource
    private CateMapper cateMapper;
    @Resource
    private BookRankVoMapper bookRankVoMapper;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public PageInfo<BookVo> getBooksBySecondCateIDAndCondition(Integer id,Integer condition, Integer currentPage) {
        if (currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage, Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectBySecondCateIdAndCondition(id,condition));
        return pageInfo;
    }

    @Override
    public PageInfo<BookVo> getBooksByFirstCateIDAndCondition(Integer id,Integer condition, Integer currentPage) {
        if (currentPage==null) currentPage=1;//若未传入页数则默认为1
        //设置查询条件，即根据指定父类查询分类
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        //查询该父类下的所有子类
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        //将所有子类ID封装为list传递给mapper层
        List<Integer> ids=new ArrayList<>();
        cates.forEach((cate)->{ids.add(cate.getCateId());});
        //设置分页参数
        PageHelper.startPage(currentPage,Define.PAGE_SIZE);
        //将子类ID传入mapper方法查询对应类别下的书籍
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectByFirstCateIdAndCondition(ids,condition));
        return pageInfo;
    }

    @Override
    public PageInfo<BookVo> getAllBookByCondition(Integer currentPage, Integer condition) {
        if(currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage,Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectAllByCondition(condition));
        return pageInfo;
    }

    @Override
    public BookVo getBookById(Integer id) {
        return bookVoMapper.selectBookById(id);
    }

    @Override
    public BookRankVo getBookRankByBookIdAndCateId(Integer bookId, Integer cateId) {
        return bookRankVoMapper.selectByBookId(bookId,cateId);
    }

    @Override
    public List<BookVo> getOtherTopRankBookByCateId(Integer cateId, Integer bookId) {
        return bookVoMapper.selectOtherTopRankBookByCateId(cateId,bookId);
    }

    @Override
    public List<BookVo> getLatestBook() {
        PageHelper.startPage(1,12);
        List<BookVo> books=new PageInfo<BookVo>(bookVoMapper.selectAllByCondition(4)).getList();
        return books;
    }

    @Override
    public List<BookVo> getMostVolumeBooks() {
        PageHelper.startPage(1,12);
        List<BookVo> books=new PageInfo<BookVo>(bookVoMapper.selectAllByCondition(2)).getList();
        return books;
    }

    @Override
    public PageInfo<BookVo> getBooksByCondition(Integer page, Integer size, Map<String,Object> map) {
        if(size==null) size=10;
        if(page==null) page=1;
        PageHelper.startPage(page,size);
        PageInfo<BookVo> books=new PageInfo<>(bookVoMapper.selectBooksByCondition(map));
        return books;
    }

    @Override
    public Integer updateBook(Book book) {
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public Integer addBook(Book book) {
        book.setBookSalevolume(0);
        book.setBookShelftime(new Date());
        return bookMapper.insertSelective(book);
    }

    @Override
    public Integer deleteBook(Integer id) {
        return bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public AggregatedPage<BookVo> searchBook(String keyword, Integer pageNum,Integer condition) {
        if(pageNum==null) pageNum=0;
        String preTag = "<em><strong><font color='#dd4b39'>";//设置高亮标签
        String postTag = "</font></strong></em>";
        /*1.创建QueryBuilder(即设置查询条件)这里创建的是组合查询(也叫多条件查询),后面会介绍更多的查询方法
         *组合查询BoolQueryBuilder
         * must(QueryBuilders)   :AND
         * mustNot(QueryBuilders):NOT
         * should:               :OR
         */
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.should(QueryBuilders.matchQuery("bookTitle", keyword).boost(3))
                .should(QueryBuilders.matchQuery("bookIsbn", keyword).boost(3))
                .should(QueryBuilders.matchQuery("authorName", keyword).boost(3))
                .should(QueryBuilders.matchQuery("bookPress", keyword).boost(3))
                .should(QueryBuilders.matchQuery("bookDes", keyword)).boost(1)
                .should(QueryBuilders.matchQuery("cateName", keyword)).boost(1);
        Pageable page = PageRequest.of(pageNum, Define.PAGE_SIZE);
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        if(condition==2){
            nativeSearchQueryBuilder=nativeSearchQueryBuilder.withSort(new FieldSortBuilder("bookSalevolume").order(SortOrder.DESC));
        }else if(condition==3){
            nativeSearchQueryBuilder=nativeSearchQueryBuilder.withSort(new FieldSortBuilder("bookSaleprice").order(SortOrder.ASC));
        }else if(condition==4){
            nativeSearchQueryBuilder=nativeSearchQueryBuilder.withSort(new FieldSortBuilder("bookPresstime").order(SortOrder.DESC));
        }
        NativeSearchQuery searchQuery = nativeSearchQueryBuilder
                .withQuery(queryBuilder)
                //设置高亮字段
                .withHighlightFields(
                        new HighlightBuilder.Field("bookTitle").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("bookIsbn").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("authorName").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("bookPress").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("bookDes").preTags(preTag).postTags(postTag),
                        new HighlightBuilder.Field("cateName").preTags(preTag).postTags(postTag)
                        )
                .withPageable(page)
                .build();
        //实施查询，注意：这里的泛型最后和 elasticsearch 中的字段对应
        AggregatedPage<BookVo> bookPage = elasticsearchTemplate.queryForPage(searchQuery, BookVo.class, new SearchResultMapper() {
            @Override
            public <T> AggregatedPage<T> mapResults(SearchResponse response, Class<T> clazz, Pageable pageable) {
                List<BookVo> books = new ArrayList<>();
                //命中记录
                SearchHits hits = response.getHits();
                for (SearchHit hit : hits){
                    if (hits.totalHits <= 0){
                        return null;
                    }
                    BookVo book = new BookVo();
                    book.setBookId(Integer.parseInt(hit.getId()));
                    book.setBookTitle(String.valueOf(hit.getSourceAsMap().get("bookTitle")));
                    book.setBookIsbn(String.valueOf(hit.getSourceAsMap().get("bookIsbn")));
                    book.setAuthorName(String.valueOf(hit.getSourceAsMap().get("authorName")));
                    book.setBookPress(String.valueOf(hit.getSourceAsMap().get("bookPress")));
                    book.setBookDes(String.valueOf(hit.getSourceAsMap().get("bookDes")));
                    book.setBookSaleprice(new BigDecimal(String.valueOf(hit.getSourceAsMap().get("bookSaleprice"))));
                    book.setBookOrderprice(new BigDecimal(String.valueOf(hit.getSourceAsMap().get("bookOrderprice"))));
                    long bookPresstime = Long.parseLong(String.valueOf(hit.getSourceAsMap().get("bookPresstime")));
                    book.setBookPresstime(new Date(bookPresstime));
                    book.setBookSalevolume(Integer.parseInt(String.valueOf(hit.getSourceAsMap().get("bookSalevolume"))));
                    book.setBookImg(String.valueOf(hit.getSourceAsMap().get("bookImg")));
                    book.setCateName(String.valueOf(hit.getSourceAsMap().get("cateName")));
                    //设置高亮（若对应字段有高亮的话）
                    setHighLight(hit, "bookTitle", book);
                    setHighLight(hit, "bookIsbn", book);
                    setHighLight(hit, "authorName", book);
                    setHighLight(hit, "bookPress", book);
                    setHighLight(hit, "bookDes", book);
                    setHighLight(hit, "cateName", book);
                    books.add(book);
                }
                AggregatedPage<T> result = new AggregatedPageImpl<T>((List<T>)books, pageable,
                        response.getHits().getTotalHits());
                return result;
            }

            @Override
            public <T> T mapSearchHit(SearchHit searchHit, Class<T> aClass) {
                return null;
            }
        });
        return bookPage;
    }

    private static void setHighLight(SearchHit hit, String filed, Object object){
        //获取对应的高亮域
        Map<String, HighlightField> highlightFields = hit.getHighlightFields();
        HighlightField highlightField = highlightFields.get(filed);
        if (highlightField != null){
            //取得定义的高亮标签
            String highLightMessage = highlightField.fragments()[0].toString();
            // 反射调用set方法将高亮内容设置进去
            try {
                String setMethodName = parSetMethodName(filed);
                Class<?> Clazz = object.getClass();
                Method setMethod = Clazz.getMethod(setMethodName, String.class);
                setMethod.invoke(object, highLightMessage);
            } catch (Exception e) {

            }
        }
    }

    private static String parSetMethodName(String fieldName){
        if (StringUtils.isBlank(fieldName)){
            return null;
        }
        int startIndex = 0;
        if (fieldName.charAt(0) == '_'){
            startIndex = 1;
        }
        return "set" + fieldName.substring(startIndex, startIndex + 1).toUpperCase()
                + fieldName.substring(startIndex + 1);
    }

}
