package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

@Data
public class AdminRole {
    private Integer adminRoleId;

    private Integer adminId;

    private Integer roleId;

    public AdminRole(Integer adminId, Integer roleId) {
        this.adminId = adminId;
        this.roleId = roleId;
    }

    public AdminRole(){

    }
}