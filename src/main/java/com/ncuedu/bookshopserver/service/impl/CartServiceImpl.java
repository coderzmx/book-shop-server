package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.CartMapper;
import com.ncuedu.bookshopserver.mapper.CartVoMapper;
import com.ncuedu.bookshopserver.pojo.Cart;
import com.ncuedu.bookshopserver.pojo.CartExample;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import com.ncuedu.bookshopserver.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 21:31
 **/
@Service
public class CartServiceImpl implements CartService {

    @Resource
    private CartMapper cartMapper;

    @Resource
    private CartVoMapper cartVoMapper;
    @Override
    public Integer addCart(Cart cart) {
        CartExample cartExample = new CartExample();
        cartExample.or().andUserIdEqualTo(cart.getUserId()).andBookIdEqualTo(cart.getBookId());
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        if(carts.size()==0) return cartMapper.insert(cart);
        else {
            Cart cart1 = carts.get(0);
            cart1.setCartAmount(cart1.getCartAmount()+1);
            cart1.setCartPrice(cart1.getBookSaleprice().multiply(new BigDecimal(cart1.getCartAmount())));
            return cartMapper.updateByPrimaryKeySelective(cart1);
        }
    }

    @Override
    public List<CartVo> getCartByUserId(Integer userId) {
        CartExample cartExample = new CartExample();
        cartExample.or().andUserIdEqualTo(userId);
        List<CartVo> carts = cartVoMapper.selectCartsByUserId(userId);
        return carts;
    }

    @Override
    public Integer deleteCart(Integer cartId) {
        return cartMapper.deleteByPrimaryKey(cartId);
    }

    @Override
    public Integer updateCart(Cart cart) {
        return cartMapper.updateByPrimaryKeySelective(cart);
    }

    @Override
    public Integer deleteCarts(List<Integer> ids) {
        return cartMapper.deleteByIds(ids);
    }

    @Override
    public Integer getCartAmount(Integer userId) {
        CartExample cartExample = new CartExample();
        cartExample.or().andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        int result=0;
        for (Cart cart : carts) {
            result+=cart.getCartAmount();
        }
        return result;
    }
}
