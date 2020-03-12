package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 15:41
 **/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/booksByCateAndCondition")
    public PageInfo<BookVo> getBooksByCateAndCondition(Integer id,Integer condition, Integer currentPage){
        return bookService.getBooksBySecondCateIDAndCondition(id,condition,currentPage);
    }

    @GetMapping("/book/booksByFirstCateAndCondition")
    public PageInfo<BookVo> getBooksByFirstCate(Integer id,Integer condition, Integer currentPage){
        return bookService.getBooksByFirstCateIDAndCondition(id,condition,currentPage);
    }

    @GetMapping("/book/bookByCondition")
    public PageInfo<BookVo> getBookByCindition(Integer currentPage,Integer condition){
        return bookService.getAllBookByCondition(currentPage,condition);
    }

    @GetMapping("/book/bookById")
    public BookVo getBookById(Integer id){
        return bookService.getBookById(id);
    }

    @GetMapping("/book/rank")
    public BookRankVo getBookRank(Integer bookId,Integer cateId){
        return bookService.getBookRankByBookIdAndCateId(bookId,cateId);
    }

    @GetMapping("/book/otherTopRankBook")
    public List<BookVo> getOtherTopRankBookByCateId(Integer cateId,Integer bookId){
        return bookService.getOtherTopRankBookByCateId(cateId,bookId);
    }
}
