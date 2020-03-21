package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

@Data
public class Author {
    private Integer authorId;

    private String authorName;

    private String authorImg;

    private String authorDes;
}