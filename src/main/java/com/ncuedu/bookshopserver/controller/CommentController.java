package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;
import com.ncuedu.bookshopserver.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 21:02
 **/
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comment/count")
    public Map<String, Object> getCommentCountByBookId(Integer bookId){
        return commentService.getCommentCountByBookId(bookId);
    }

    @GetMapping("/comments")
    public PageInfo<CommentVo> getCommentByFilterCondition(Integer condition,Integer bookId,Integer currentPage){
        return commentService.getCommentByCondition(condition,bookId,currentPage);
    }

    @PutMapping("/comment/{id}")
    public Integer addCommentPraise(@RequestBody Comment comment){
        return commentService.addCommentPraise(comment);
    }

    @GetMapping("/comment/average")
    public double getCommentAveragr(Integer bookId){
        return commentService.getCommentAverage(bookId);
    }

    @PostMapping("/comment")
    public Integer addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }
}
