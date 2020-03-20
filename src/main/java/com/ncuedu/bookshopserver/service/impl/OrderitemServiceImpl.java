package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.OrderitemMapper;
import com.ncuedu.bookshopserver.pojo.Orderitem;
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
    @Override
    public Integer updateOrderitem(Orderitem orderitem) {
        return orderitemMapper.updateByPrimaryKeySelective(orderitem);
    }
}
