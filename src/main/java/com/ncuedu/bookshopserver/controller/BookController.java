package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.service.BookService;
import com.ncuedu.bookshopserver.util.AdminAuthority;
import com.ncuedu.bookshopserver.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 15:41
 **/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private AdminAuthority authority;

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

    @GetMapping("/book/latest")
    public List<BookVo> getLatestBook(){
        return bookService.getLatestBook();
    }

    @GetMapping("/book/mostVolume")
    public List<BookVo> getMostVolumeBook(){
        return bookService.getMostVolumeBooks();
    }

    @GetMapping("/admin/books")
    public Message getBooks(Integer page,String title,String author,String stock,String saleVolume,String flag, Integer size, String adminToken){
        if(adminToken==null||!authority.checkAuthority(adminToken,"/books")) return new Message(null,401);
        Map<String,Object> filter=new HashMap<>();
        filter.put("title",title);
        filter.put("author",author);
        filter.put("stock",stock);
        filter.put("saleVolume",saleVolume);
        filter.put("flag",flag);
        return new Message(bookService.getBooksByCondition(page,size,filter),200);
    }

    @PutMapping("/admin/book")
    public Integer updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @PostMapping("/admin/book")
    public Integer addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("/admin/book/{id}")
    public Integer deleteBook(@PathVariable("id") Integer id){
        return bookService.deleteBook(id);
    }
}
