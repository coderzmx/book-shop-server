package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userTel;

    private String userEmail;

    private BigDecimal userMoney;

    private String userDes;

    private String userNickname;

    private String userImg;

    public User(String userName, String userPassword, String userTel) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userTel = userTel;
    }
    public User(){

    }
}