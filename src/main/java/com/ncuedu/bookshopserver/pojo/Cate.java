package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

@Data
public class Cate {
    private Integer cateId;

    private String cateName;

    private Integer parentId;
}