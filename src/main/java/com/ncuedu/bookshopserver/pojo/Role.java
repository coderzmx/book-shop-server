package com.ncuedu.bookshopserver.pojo;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private Date roleCreateTime;

    private Date roleUpdateTime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }
}