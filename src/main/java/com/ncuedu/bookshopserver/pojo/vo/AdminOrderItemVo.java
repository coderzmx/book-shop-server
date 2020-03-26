package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Address;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import lombok.Data;

import java.util.Date;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/26 19:39
 **/
@Data
public class AdminOrderItemVo extends Orderitem {
    private Date orderTime;

    private String userName;

    private Address address;

    private String bookTitle;

    @Override
    public String toString() {
        return "AdminOrderItemVo{" +
                super.toString()+
                ", orderTime=" + orderTime +
                ", userName='" + userName + '\'' +
                ", address=" + address +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
