package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Orderitem;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 14:46
 **/
public interface OrderService {

    Integer addOrder(List<Orderitem> orderitems, Integer userId, Integer addressId,List<Integer> cartIds);
}
