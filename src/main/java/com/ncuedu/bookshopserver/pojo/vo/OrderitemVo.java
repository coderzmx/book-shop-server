package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Orderitem;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 21:24
 **/
@Data
public class OrderitemVo extends Orderitem {
    private String bookImg;

    private String bookTitle;

    private BigDecimal bookSaleprice;

    @Override
    public String toString() {
        return "OrderitemVo{" +
                super.toString()+
                "bookImg='" + bookImg + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookSaleprice=" + bookSaleprice +
                '}';
    }
}
