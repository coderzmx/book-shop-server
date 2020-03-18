package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Orderitem {
    private Integer orderitemId;

    private Integer bookId;

    private Integer orderitemAmount;

    private BigDecimal orderitemPrice;

    private Integer orderitemState;

    private String orderitemRemark;

    private String orderId;
}