package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String adminTel;

    private String adminEmail;

    private Integer adminIsSuper;

    private Date adminCreateTime;

    private Date adminUpdateTime;

    public Admin(Integer adminId, String adminName, String adminPassword, String adminTel, String adminEmail, Integer adminIsSuper, Date adminCreateTime, Date adminUpdateTime) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminTel = adminTel;
        this.adminEmail = adminEmail;
        this.adminIsSuper = adminIsSuper;
        this.adminCreateTime = adminCreateTime;
        this.adminUpdateTime = adminUpdateTime;
    }

    public Admin(){

    }

    public Admin(String adminName, String adminPassword, String adminTel, String adminEmail, Integer adminIsSuper, Date adminCreateTime, Date adminUpdateTime) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminTel = adminTel;
        this.adminEmail = adminEmail;
        this.adminIsSuper = adminIsSuper;
        this.adminCreateTime = adminCreateTime;
        this.adminUpdateTime = adminUpdateTime;
    }
}