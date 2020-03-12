package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private Integer commentId;

    private Integer userId;

    private Integer bookId;

    private String commentContent;

    private Date commentTime;

    private Integer commentPraise;

    private Integer commentGrade;

    private Integer targetId;

    private String commentImg1;

    private String commentImg2;

    private String commentImg3;
}