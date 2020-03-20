package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String orderId;

    private Integer userId;

    private Date orderTime;

    private Integer addressId;
}