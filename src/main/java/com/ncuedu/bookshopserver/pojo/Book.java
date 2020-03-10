package com.ncuedu.bookshopserver.pojo;

import java.math.BigDecimal;
import java.util.Date;

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

    private Integer cateId;

    private Integer bookFlag;

    private String bookRecommend;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle == null ? null : bookTitle.trim();
    }

    public Integer getBookStock() {
        return bookStock;
    }

    public void setBookStock(Integer bookStock) {
        this.bookStock = bookStock;
    }

    public BigDecimal getBookOrderprice() {
        return bookOrderprice;
    }

    public void setBookOrderprice(BigDecimal bookOrderprice) {
        this.bookOrderprice = bookOrderprice;
    }

    public BigDecimal getBookSaleprice() {
        return bookSaleprice;
    }

    public void setBookSaleprice(BigDecimal bookSaleprice) {
        this.bookSaleprice = bookSaleprice;
    }

    public Integer getBookSalevolume() {
        return bookSalevolume;
    }

    public void setBookSalevolume(Integer bookSalevolume) {
        this.bookSalevolume = bookSalevolume;
    }

    public Date getBookShelftime() {
        return bookShelftime;
    }

    public void setBookShelftime(Date bookShelftime) {
        this.bookShelftime = bookShelftime;
    }

    public Date getBookPresstime() {
        return bookPresstime;
    }

    public void setBookPresstime(Date bookPresstime) {
        this.bookPresstime = bookPresstime;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    public String getBookDes() {
        return bookDes;
    }

    public void setBookDes(String bookDes) {
        this.bookDes = bookDes == null ? null : bookDes.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg == null ? null : bookImg.trim();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(Integer bookFlag) {
        this.bookFlag = bookFlag;
    }

    public String getBookRecommend() {
        return bookRecommend;
    }

    public void setBookRecommend(String bookRecommend) {
        this.bookRecommend = bookRecommend == null ? null : bookRecommend.trim();
    }
}