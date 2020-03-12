package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.AuthorMapper;
import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 16:17
 **/
@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorMapper authorMapper;

    @Override
    public Author getAuthorById(Integer id) {
        return authorMapper.selectByPrimaryKey(id);
    }
}
