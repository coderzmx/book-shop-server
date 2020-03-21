package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book {
    private Integer bookId;

    private String bookTitle;

    private Integer bookStock;

    private BigDecimal bookOrderprice;

    private BigDecimal bookSaleprice;

    private Integer bookSalevolume;

    private Date bookShelftime;

    private Date bookPresstime;

    private String bookIsbn;

    private String bookPress;

    private String bookDes;

    private Integer authorId;

    private String bookImg;

    private String bookImg2;

    private String bookImg3;

    private String bookImg4;

    private Integer cateId;

    private Integer bookFlag;

    private String bookRecommend;
}