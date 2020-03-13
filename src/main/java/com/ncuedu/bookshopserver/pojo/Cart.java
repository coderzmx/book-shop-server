package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer bookId;

    private Integer cartAmount;

    private Date cartTime;

    private BigDecimal cartPrice;
}