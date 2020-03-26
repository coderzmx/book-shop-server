package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.pojo.vo.AdminOrderItemVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/19 12:53
 **/
public interface OrderitemService {
    Integer updateOrderitem(Orderitem orderitem);

    PageInfo<AdminOrderItemVo> getOrders(Integer page,String userName,String bookTitle,String orderitemState);
}
