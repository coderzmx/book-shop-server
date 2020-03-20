package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Order;
import lombok.Data;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 21:47
 **/
@Data
public class OrderVo extends Order {
    private List<OrderitemVo> orderitems;

    @Override
    public String toString() {
        return "OrderVo{" +
                super.toString()+
                "orderitems=" + orderitems +
                '}';
    }
}
