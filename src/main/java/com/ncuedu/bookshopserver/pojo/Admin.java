package com.ncuedu.bookshopserver.pojo;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private Integer adminIsSuper;

    private Date adminCreateTime;

    private Date adminUpdateTime;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminIsSuper() {
        return adminIsSuper;
    }

    public void setAdminIsSuper(Integer adminIsSuper) {
        this.adminIsSuper = adminIsSuper;
    }

    public Date getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Date adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Date getAdminUpdateTime() {
        return adminUpdateTime;
    }

    public void setAdminUpdateTime(Date adminUpdateTime) {
        this.adminUpdateTime = adminUpdateTime;
    }
}