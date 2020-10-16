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
        //设置订单信息
        Order order = new Order();
        order.setOrderId(RandomNumber.getOrderIdByTime());
        order.setAddressId(addressId);
        order.setOrderTime(new Date());
        order.setUserId(userId);
        orderMapper.insertSelective(order);//在数据库中插入订单
        //遍历订单项列表，在数据库中插入订单项
        for (int i = 0; i < orderitems.size(); i++) {
            //设置订单项信息
            Orderitem orderitem = JSON.parseObject(JSON.toJSONString(orderitems.get(i)),Orderitem.class);
            orderitem.setOrderId(order.getOrderId());
            //在数据库中插入订单项
            orderitemMapper.insertSelective(orderitem);
            //更新书籍销量和书籍库存信息
            Book book = bookMapper.selectByPrimaryKey(orderitem.getBookId());
            book.setBookStock(book.getBookStock()-orderitem.getOrderitemAmount());
            book.setBookSalevolume(book.getBookSalevolume()+orderitem.getOrderitemAmount());
            bookMapper.updateByPrimaryKeySelective(book);
        }
        //删除已完成购买的购物车信息
        return cartMapper.deleteByIds(cartIds);
    }

    @Override
    public PageInfo<OrderVo> getOrderByUserId(Integer userId,Integer state,Integer page) {
        if(page==null) page=1;
        PageHelper.startPage(page, Define.PAGE_SIZE);//设置分页参数
        //查询订单
        PageInfo<OrderVo> orders=new PageInfo<>(orderMapper.selectOrderVoByUserIdAndOrderitemState(userId, state));
        //遍历订单列表根据订单ID绑定该订单包含的订单项
        for (OrderVo order : orders.getList()) {
            List<OrderitemVo> orderitems = orderitemVoMapper.selectOrderitemByOrderIdAndState(order.getOrderId(), state);
            order.setOrderitems(orderitems);
        }
        return orders;
    }
}
