package com.ncuedu.bookshopserver.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.*;
import com.ncuedu.bookshopserver.pojo.vo.OrderVo;
import com.ncuedu.bookshopserver.pojo.vo.OrderitemVo;
import com.ncuedu.bookshopserver.service.OrderService;
import com.ncuedu.bookshopserver.util.Define;
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
    @Resource
    private OrderitemVoMapper orderitemVoMapper;
    @Resource
    private BookMapper bookMapper;
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
            Book book = bookMapper.selectByPrimaryKey(orderitem.getBookId());
            book.setBookStock(book.getBookStock()-orderitem.getOrderitemAmount());
            bookMapper.updateByPrimaryKeySelective(book);
            orderitemMapper.insertSelective(orderitem);
        }
        cartMapper.deleteByIds(cartIds);
        return 1;
    }

    @Override
    public PageInfo<OrderVo> getOrderByUserId(Integer userId,Integer state,Integer page) {
        if(page==null) page=1;
        PageHelper.startPage(page, Define.PAGE_SIZE);
        PageInfo<OrderVo> orders=new PageInfo<>(orderMapper.selectOrderVoByUserIdAndOrderitemState(userId, state));
        for (OrderVo order : orders.getList()) {
            List<OrderitemVo> orderitems = orderitemVoMapper.selectOrderitemByOrderIdAndState(order.getOrderId(), state);
            order.setOrderitems(orderitems);
        }
        return orders;
    }
}
