package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.BookMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.mapper.CateMapper;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.BookExample;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.CateExample;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import com.ncuedu.bookshopserver.util.Define;
import org.springframework.data.domain.Page;
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

    @Override
    public PageInfo<BookVo> getBooksBySecondCateID(Integer id, Integer currentPage) {
        if (currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage, Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectBySecondCateId(id));
        return pageInfo;
    }

    @Override
    public PageInfo<BookVo> getBooksByFirstCateID(Integer id, Integer currentPage) {
        if (currentPage==null) currentPage=1;
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        List<Integer> ids=new ArrayList<>();
        cates.forEach((cate)->{ids.add(cate.getCateId());});
        PageHelper.startPage(currentPage,Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectByFirstCateId(ids));
        return pageInfo;
    }

    @Override
    public PageInfo<BookVo> getAllBook(Integer currentPage) {
        if(currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage,Define.PAGE_SIZE);
        PageInfo<BookVo> pageInfo=new PageInfo<>(bookVoMapper.selectAll());
        return pageInfo;
    }
}
