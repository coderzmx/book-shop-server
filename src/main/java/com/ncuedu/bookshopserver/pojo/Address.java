package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

@Data
public class Address {
    private Integer addressId;

    private Integer userId;

    private String addressProvince;

    private String addressCity;

    private String addressCounty;

    private String addressStreet;

    private String addressDetailed;

    private String addressCode;

    private String addressName;

    private String addressTel;

    private Integer addressFlag;
}