package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Cart;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import com.ncuedu.bookshopserver.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 21:54
 **/
@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/cart/addCart")
    public Integer addCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }

    @GetMapping("/cart/carts")
    public List<CartVo> getCartsByUserId(Integer userId){
        return cartService.getCartByUserId(userId);
    }
}
