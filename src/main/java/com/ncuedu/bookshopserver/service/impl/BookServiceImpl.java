package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.BookMapper;
import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.mapper.CateMapper;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.CateExample;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import com.ncuedu.bookshopserver.util.Define;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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


    @Override
    public PageInfo<BookVo> getBooksBySecondCateIDAndCondition(Integer id,Integer condition, Integer currentPage) {
        if (currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage, Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectBySecondCateIdAndCondition(id,condition));
        return pageInfo;
    }

    @Override
    public PageInfo<BookVo> getBooksByFirstCateIDAndCondition(Integer id,Integer condition, Integer currentPage) {
        if (currentPage==null) currentPage=1;
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        List<Integer> ids=new ArrayList<>();
        cates.forEach((cate)->{ids.add(cate.getCateId());});
        PageHelper.startPage(currentPage,Define.PAGE_SIZE);
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
}
