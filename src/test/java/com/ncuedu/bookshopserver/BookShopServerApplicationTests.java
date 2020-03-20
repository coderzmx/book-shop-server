package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.*;
import com.ncuedu.bookshopserver.util.RandomNumber;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BookShopServerApplicationTests {
    @Resource
    private BookVoMapper bookVoMapper;
    @Resource
    private BookRankVoMapper bookRankVoMapper;
    @Resource
    private CommentVoMapper commentVoMapper;
    @Resource
    private CartVoMapper cartVoMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private OrderitemVoMapper orderitemVoMapper;
    @Resource
    private OrderMapper orderMapper;
    @Test
    public void test(){
        List<OrderVo> orderVos = orderMapper.selectOrderVoByUserIdAndOrderitemState(1, 0);
        System.out.println(orderVos.size());
    }

}
