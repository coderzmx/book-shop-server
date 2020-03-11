package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Book;
import lombok.Data;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 16:38
 **/
@Data
public class BookVo extends Book {

    private String authorName;

    @Override
    public String toString() {
        return "BookVo{" +
                "authorName='" + authorName + '\'' +
                super.toString()+
                '}';
    }
}
