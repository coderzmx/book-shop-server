package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.service.OrderitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/19 12:55
 **/
@RestController
public class OrderitemController {
    @Autowired
    private OrderitemService orderitemService;
    @PutMapping("/orderitem")
    public Integer updateOrderitem(@RequestBody Orderitem orderitem){
        return orderitemService.updateOrderitem(orderitem);
    }
}
