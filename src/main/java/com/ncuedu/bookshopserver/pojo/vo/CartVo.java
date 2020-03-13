package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Cart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 23:15
 **/
@Data
public class CartVo extends Cart {

    private String bookTitle;

    private String bookImg;

    private BigDecimal bookSaleprice;

    @Override
    public String toString() {
        return "CartVo{" +
                super.toString()+
                "bookTitle='" + bookTitle + '\'' +
                ", bookImg='" + bookImg + '\'' +
                ", bookSaleprice=" + bookSaleprice +
                '}';
    }
}
