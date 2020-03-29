package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.pojo.Item;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import com.ncuedu.bookshopserver.util.BookRepository;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.SearchResultMapper;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.aggregation.impl.AggregatedPageImpl;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BookShopServerApplicationTests {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private BookRepository itemRepository;
    @Resource
    private BookVoMapper bookVoMapper;
    @Resource
    private BookService bookService;
    @Test
    void test(){
        List<BookVo> bookVos = bookVoMapper.selectAllByCondition(2);
        System.out.println(bookVos);
    }

    @Test
    public void insertList() {
        List<BookVo> bookVos = bookVoMapper.selectAllByCondition(1);
        // 接收对象集合，实现批量新增
        itemRepository.saveAll(bookVos);
    }

    @Test
    public void createIndex(){
        elasticsearchTemplate.createIndex(BookVo.class);
    }

    @Test
    void delete(){
        itemRepository.deleteById(56L);
    }

    @Test
    void insert(){
        BookVo bookVo = bookVoMapper.selectBookById(1);
        bookVo.setBookFlag(1);
        itemRepository.save(bookVo);
        System.out.println(bookVo);
    }

}
