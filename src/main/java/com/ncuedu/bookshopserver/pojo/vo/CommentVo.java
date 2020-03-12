package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Comment;
import lombok.Data;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 22:09
 **/
@Data
public class CommentVo extends Comment {

    private String userNickname;

    private String userImg;

    @Override
    public String toString() {
        return "CommentVo{" +
                super.toString()
                +
                "userNickname='" + userNickname + '\'' +
                ", userImg='" + userImg + '\'' +
                '}';
    }
}
