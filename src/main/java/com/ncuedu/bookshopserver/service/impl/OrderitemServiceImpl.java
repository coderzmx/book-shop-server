package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.AdminOrderitemMapper;
import com.ncuedu.bookshopserver.mapper.OrderitemMapper;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.pojo.vo.AdminOrderItemVo;
import com.ncuedu.bookshopserver.service.OrderitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/19 12:54
 **/
@Service
public class OrderitemServiceImpl implements OrderitemService {
    @Resource
    private OrderitemMapper orderitemMapper;
    @Resource
    private AdminOrderitemMapper adminOrderitemMapper;
    @Override
    public Integer updateOrderitem(Orderitem orderitem) {
        return orderitemMapper.updateByPrimaryKeySelective(orderitem);
    }

    @Override
    public PageInfo<AdminOrderItemVo> getOrders(Integer page,String userName,String bookTitle,String orderitemState) {
        if(page==null) page=1;
        PageHelper.startPage(page,10);
        PageInfo<AdminOrderItemVo> orders=new PageInfo<>(adminOrderitemMapper.selectOrders(userName, bookTitle, orderitemState));
        return orders;
    }
}
