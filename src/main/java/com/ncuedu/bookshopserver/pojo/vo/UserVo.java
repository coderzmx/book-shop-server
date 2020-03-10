package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.User;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 23:04
 **/
@Data
public class UserVo {

    private Integer userId;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userTel;

    private String userEmail;

    private BigDecimal userMoney;

    private String userDes;

    private String code;
}
