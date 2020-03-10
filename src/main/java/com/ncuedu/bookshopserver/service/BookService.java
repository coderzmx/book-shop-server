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

    PageInfo<BookVo> getBooksBySecondCateID(Integer id, Integer currentPage);

    PageInfo<BookVo> getBooksByFirstCateID(Integer id,Integer currentPage);

    PageInfo<BookVo> getAllBook(Integer currentPage);
}
