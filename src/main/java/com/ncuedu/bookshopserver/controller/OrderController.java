package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 14:47
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public Integer addOrder(@RequestBody Map<String,Object> map){
        List<Orderitem> orderitems= (List<Orderitem>) map.get("orderitems");
        Integer userId= (Integer) map.get("userId");
        Integer addressId= (Integer) map.get("addressId");
        List<Integer> cartIds= (List<Integer>) map.get("cartIds");
        return orderService.addOrder(orderitems,userId,addressId,cartIds);
    }
}
