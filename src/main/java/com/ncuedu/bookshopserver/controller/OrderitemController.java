package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Orderitem;
import com.ncuedu.bookshopserver.pojo.vo.AdminOrderItemVo;
import com.ncuedu.bookshopserver.service.OrderitemService;
import com.ncuedu.bookshopserver.util.AdminAuthority;
import com.ncuedu.bookshopserver.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Autowired
    private AdminAuthority authority;

    @PutMapping("/orderitem")
    public Integer updateOrderitem(@RequestBody Orderitem orderitem){
        return orderitemService.updateOrderitem(orderitem);
    }

    @GetMapping("/admin/orders")
    public Message getOrders(Integer page, String userName, String bookTitle, String orderitemState, String adminToken){
        if(adminToken==null||!authority.checkAuthority(adminToken,"/orders")) return new Message(null,401);
        return new Message(orderitemService.getOrders(page,userName,bookTitle,orderitemState),200);
    }
}
