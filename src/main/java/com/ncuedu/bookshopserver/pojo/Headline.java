package com.ncuedu.bookshopserver.pojo;

import java.util.Date;

public class Headline {
    private Integer headlineId;

    private String headlineContent;

    private String headlineImg;

    private Date headlineTime;

    public Integer getHeadlineId() {
        return headlineId;
    }

    public void setHeadlineId(Integer headlineId) {
        this.headlineId = headlineId;
    }

    public String getHeadlineContent() {
        return headlineContent;
    }

    public void setHeadlineContent(String headlineContent) {
        this.headlineContent = headlineContent == null ? null : headlineContent.trim();
    }

    public String getHeadlineImg() {
        return headlineImg;
    }

    public void setHeadlineImg(String headlineImg) {
        this.headlineImg = headlineImg == null ? null : headlineImg.trim();
    }

    public Date getHeadlineTime() {
        return headlineTime;
    }

    public void setHeadlineTime(Date headlineTime) {
        this.headlineTime = headlineTime;
    }
}