package com.ncuedu.bookshopserver.pojo;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer userId;

    private Integer bookId;

    private String commentContent;

    private Date commentTime;

    private Integer commentPraise;

    private Integer commentGrade;

    private Integer targetId;

    private String commentImg1;

    private String commentImg2;

    private String commentImg3;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentPraise() {
        return commentPraise;
    }

    public void setCommentPraise(Integer commentPraise) {
        this.commentPraise = commentPraise;
    }

    public Integer getCommentGrade() {
        return commentGrade;
    }

    public void setCommentGrade(Integer commentGrade) {
        this.commentGrade = commentGrade;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getCommentImg1() {
        return commentImg1;
    }

    public void setCommentImg1(String commentImg1) {
        this.commentImg1 = commentImg1 == null ? null : commentImg1.trim();
    }

    public String getCommentImg2() {
        return commentImg2;
    }

    public void setCommentImg2(String commentImg2) {
        this.commentImg2 = commentImg2 == null ? null : commentImg2.trim();
    }

    public String getCommentImg3() {
        return commentImg3;
    }

    public void setCommentImg3(String commentImg3) {
        this.commentImg3 = commentImg3 == null ? null : commentImg3.trim();
    }
}