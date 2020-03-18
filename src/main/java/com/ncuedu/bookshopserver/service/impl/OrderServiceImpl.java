package com.ncuedu.bookshopserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.ncuedu.bookshopserver.mapper.CartMapper;
import com.ncuedu.bookshopserver.mapper.OrderMapper;
import com.ncuedu.bookshopserver.mapper.OrderitemMapper;
import com.ncuedu.bookshopserver.pojo.Cart;
import com.ncuedu.bookshopserver.pojo.Order;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.service.OrderService;
import com.ncuedu.bookshopserver.util.RandomNumber;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 14:47
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private OrderitemMapper orderitemMapper;
    @Override
    public Integer addOrder(List<Orderitem> orderitems,Integer userId,Integer addressId,List<Integer> cartIds) {
        Order order = new Order();
        order.setOrderId(RandomNumber.getOrderIdByTime());
        order.setAddressId(addressId);
        order.setOrderTime(new Date());
        order.setUserId(userId);
        orderMapper.insertSelective(order);
        for (int i = 0; i < orderitems.size(); i++) {
            Orderitem orderitem = JSON.parseObject(JSON.toJSONString(orderitems.get(i)),Orderitem.class);
            orderitem.setOrderId(order.getOrderId());
            orderitemMapper.insertSelective(orderitem);
        }
        cartMapper.deleteByIds(cartIds);
        return 1;
    }
}
