package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/17 18:50
 **/
public interface BookService {

    PageInfo<BookVo> getBooksBySecondCateIDAndCondition(Integer id,Integer condition, Integer currentPage);

    PageInfo<BookVo> getBooksByFirstCateIDAndCondition(Integer id,Integer condition,Integer currentPage);

    PageInfo<BookVo> getAllBookByCondition(Integer currentPage,Integer condition);

}
