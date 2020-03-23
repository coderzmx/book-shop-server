package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Role {
    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private Date roleCreateTime;

    private Date roleUpdateTime;
}