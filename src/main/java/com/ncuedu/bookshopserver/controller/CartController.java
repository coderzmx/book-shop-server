package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Cart;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import com.ncuedu.bookshopserver.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 21:54
 **/
@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public Integer addCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }

    @GetMapping("/carts")
    public List<CartVo> getCartsByUserId(Integer userId){
        return cartService.getCartByUserId(userId);
    }

    @DeleteMapping("/cart/{cartId}")
    public Integer deleteCart(@PathVariable("cartId") Integer cartId){
        return cartService.deleteCart(cartId);
    }

    @PutMapping("/cart/{cartId}")
    public Integer updateCart(@RequestBody Cart cart){
        return cartService.updateCart(cart);
    }

    @PostMapping("/carts")
    public Integer deleteCarts(@RequestBody Map<String,Object> map){
        List<Integer> ids= (List<Integer>) map.get("ids");
        return cartService.deleteCarts(ids);
    }

    @GetMapping("/cart/amounts")
    public Integer getAmountsByUserId(Integer userId){
        return cartService.getCartAmount(userId);
    }

}
