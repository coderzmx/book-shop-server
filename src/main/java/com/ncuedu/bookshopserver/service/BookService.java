package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
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

    BookVo getBookById(Integer id);

    BookRankVo getBookRankByBookIdAndCateId(Integer bookId,Integer cateId);

    List<BookVo> getOtherTopRankBookByCateId(Integer cateId,Integer bookId);

    List<BookVo> getLatestBook();

    List<BookVo> getMostVolumeBooks();
}
