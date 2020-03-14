package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Cart;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 21:31
 **/
public interface CartService {
    Integer addCart(Cart cart);

    List<CartVo> getCartByUserId(Integer userId);

    Integer deleteCart(Integer cartId);

    Integer updateCart(Cart cart);

    Integer deleteCarts(List<Integer> ids);

    Integer getCartAmount(Integer userId);
}
