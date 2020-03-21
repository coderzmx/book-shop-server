package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.pojo.vo.AuthorVo;
import com.ncuedu.bookshopserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 16:19
 **/
@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable("id") Integer id){
        return authorService.getAuthorById(id);
    }

    @GetMapping("/author/popular")
    public List<AuthorVo> getMostPopularAuthor(){
        return authorService.getMostPopularAuthor(4);
    }
}
