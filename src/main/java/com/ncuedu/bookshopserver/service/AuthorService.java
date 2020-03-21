package com.ncuedu.bookshopserver.service;

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
}
