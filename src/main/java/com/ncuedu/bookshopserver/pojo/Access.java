package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Access {
    private Integer accessId;

    private String accessTitle;

    private String accessUri;

    private Date accessCreateTime;

    private Date accessUpdateTime;
}