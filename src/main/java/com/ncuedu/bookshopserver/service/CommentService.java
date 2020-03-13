package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;

import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 20:59
 **/
public interface CommentService {

    Map<String,Object> getCommentCountByBookId(Integer bookId);

    PageInfo<CommentVo> getCommentByCondition(Integer condition,Integer bookId,Integer currentPage);

    Integer addCommentPraise(Comment comment);
}
