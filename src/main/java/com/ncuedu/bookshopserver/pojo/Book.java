package com.ncuedu.bookshopserver.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book implements Serializable {
    @Id
    private Integer bookId;

    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String bookTitle;

    private Integer bookStock;

    @Field(type = FieldType.Double)
    private BigDecimal bookOrderprice;

    @Field(type = FieldType.Double)
    private BigDecimal bookSaleprice;

    @Field(type = FieldType.Integer)
    private Integer bookSalevolume;

    private Date bookShelftime;

    @Field(type = FieldType.Date)
    private Date bookPresstime;

    @Field(type = FieldType.Keyword)
    private String bookIsbn;

    @Field(type = FieldType.Keyword)
    private String bookPress;

    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String bookDes;

    private Integer authorId;

    @Field(type = FieldType.Keyword)
    private String bookImg;

    private String bookImg2;

    private String bookImg3;

    private String bookImg4;

    private Integer cateId;

    @Field(type = FieldType.Keyword)
    private Integer bookFlag;

    private String bookRecommend;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookStock=" + bookStock +
                ", bookOrderprice=" + bookOrderprice +
                ", bookSaleprice=" + bookSaleprice +
                ", bookSalevolume=" + bookSalevolume +
                ", bookShelftime=" + bookShelftime +
                ", bookPresstime=" + bookPresstime +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookPress='" + bookPress + '\'' +
                ", authorId=" + authorId +
                ", cateId=" + cateId +
                ", bookFlag=" + bookFlag +
                '}';
    }
}