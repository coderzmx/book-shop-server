package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.pojo.vo.OrderVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 14:46
 **/
public interface OrderService {

    Integer addOrder(List<Orderitem> orderitems, Integer userId, Integer addressId,List<Integer> cartIds);

    PageInfo<OrderVo> getOrderByUserId(Integer userId,Integer state,Integer page);
}
