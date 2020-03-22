package com.ncuedu.bookshopserver.pojo;

import java.util.Date;

public class Access {
    private Integer accessId;

    private String accessTitle;

    private String accessUri;

    private Date accessCreateTime;

    private Date accessUpdateTime;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getAccessTitle() {
        return accessTitle;
    }

    public void setAccessTitle(String accessTitle) {
        this.accessTitle = accessTitle == null ? null : accessTitle.trim();
    }

    public String getAccessUri() {
        return accessUri;
    }

    public void setAccessUri(String accessUri) {
        this.accessUri = accessUri == null ? null : accessUri.trim();
    }

    public Date getAccessCreateTime() {
        return accessCreateTime;
    }

    public void setAccessCreateTime(Date accessCreateTime) {
        this.accessCreateTime = accessCreateTime;
    }

    public Date getAccessUpdateTime() {
        return accessUpdateTime;
    }

    public void setAccessUpdateTime(Date accessUpdateTime) {
        this.accessUpdateTime = accessUpdateTime;
    }
}