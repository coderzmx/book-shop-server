package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 22:11
 **/
public interface CommentVoMapper {

    List<CommentVo> selectByFilterCondition(@Param("condition") Integer condition,@Param("bookId") Integer bookId);
}
