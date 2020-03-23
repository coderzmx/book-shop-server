package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private Integer adminIsSuper;

    private Date adminCreateTime;

    private Date adminUpdateTime;
}