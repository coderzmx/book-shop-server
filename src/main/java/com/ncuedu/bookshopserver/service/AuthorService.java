package com.ncuedu.bookshopserver.service;

import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.pojo.vo.AuthorVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 16:16
 **/
public interface AuthorService {

    Author getAuthorById(Integer id);

    List<AuthorVo> getMostPopularAuthor(Integer size);

    List<Author> getAuthors();

    PageInfo<Author> getAuthorsByPage(Integer page,String authorName);

    Integer addAuthor(Author author);

    Integer updateAuthor(Author author);

    Integer deleteAuthor(Integer id);
}
