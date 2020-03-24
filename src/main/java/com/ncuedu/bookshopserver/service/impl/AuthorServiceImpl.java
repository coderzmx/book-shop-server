package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.AuthorMapper;
import com.ncuedu.bookshopserver.mapper.BookMapper;
import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.AuthorVo;
import com.ncuedu.bookshopserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 16:17
 **/
@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorMapper authorMapper;
    @Resource
    private BookMapper bookMapper;

    @Override
    public Author getAuthorById(Integer id) {
        return authorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AuthorVo> getMostPopularAuthor(Integer size) {
        List<AuthorVo> authorVos = authorMapper.selectMostPopularAuthor(4);
        for (AuthorVo authorVo : authorVos) {
            List<Book> books = bookMapper.selectPopularBooksByAuthorId(authorVo.getAuthorId(), 4);
            authorVo.setBooks(books);
        }
        return authorVos;
    }

    @Override
    public List<Author> getAuthors() {
        return authorMapper.selectByExample(null);
    }
}
