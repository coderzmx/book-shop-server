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

    public Role(Integer roleId, String roleName, String roleDesc, Date roleCreateTime, Date roleUpdateTime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleCreateTime = roleCreateTime;
        this.roleUpdateTime = roleUpdateTime;
    }

    public Role(){

    }

    public Role(String roleName, String roleDesc, Date roleCreateTime, Date roleUpdateTime) {
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleCreateTime = roleCreateTime;
        this.roleUpdateTime = roleUpdateTime;
    }
}