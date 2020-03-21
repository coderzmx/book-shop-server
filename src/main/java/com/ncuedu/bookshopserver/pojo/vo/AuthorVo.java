package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.pojo.Book;
import lombok.Data;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/21 15:36
 **/
@Data
public class AuthorVo extends Author {
    private List<Book> books;

    @Override
    public String toString() {
        return "AuthorVo{" +
                super.toString()+
                "books=" + books +
                '}';
    }
}
