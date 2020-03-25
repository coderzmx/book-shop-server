package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Author;
import com.ncuedu.bookshopserver.pojo.vo.AuthorVo;
import com.ncuedu.bookshopserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/authors/page")
    public PageInfo<Author> getAuthorsByPage(Integer page,String authorName){
        System.out.println(authorName);
        return authorService.getAuthorsByPage(page,authorName);
    }

    @PostMapping("/author")
    public Integer addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @PutMapping("/author")
    public Integer updateAuthor(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/author/{id}")
    public Integer deleteAuthor(@PathVariable("id") Integer id){
        return authorService.deleteAuthor(id);
    }
}
