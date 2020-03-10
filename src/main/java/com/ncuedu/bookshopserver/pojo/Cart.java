package com.ncuedu.bookshopserver.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer bookId;

    private Integer cartAmount;

    private Date cartTime;

    private BigDecimal cartPrice;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(Integer cartAmount) {
        this.cartAmount = cartAmount;
    }

    public Date getCartTime() {
        return cartTime;
    }

    public void setCartTime(Date cartTime) {
        this.cartTime = cartTime;
    }

    public BigDecimal getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(BigDecimal cartPrice) {
        this.cartPrice = cartPrice;
    }
}