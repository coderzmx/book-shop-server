package com.ncuedu.bookshopserver.pojo;

public class RoleAccess {
    private Integer roleAccessId;

    private Integer roleId;

    private Integer accessId;

    public Integer getRoleAccessId() {
        return roleAccessId;
    }

    public void setRoleAccessId(Integer roleAccessId) {
        this.roleAccessId = roleAccessId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }
}