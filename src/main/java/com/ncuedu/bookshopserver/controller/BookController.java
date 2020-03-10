package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 15:41
 **/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/booksByCate")
    public PageInfo<BookVo> getBooksByCate(Integer id, Integer currentPage){
        return bookService.getBooksBySecondCateID(id,currentPage);
    }

    @GetMapping("/book/booksByFirstCate")
    public PageInfo<BookVo> getBooksByFirstCate(Integer id, Integer currentPage){
        return bookService.getBooksByFirstCateID(id,currentPage);
    }

    @GetMapping("/book/allBook")
    public PageInfo<BookVo> getAllBook(Integer currentPage){
        return bookService.getAllBook(currentPage);
    }
}
