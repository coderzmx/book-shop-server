package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.mapper.CartVoMapper;
import com.ncuedu.bookshopserver.mapper.CommentVoMapper;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
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

    @Test
    public void test(){
        List<CartVo> cartVos = cartVoMapper.selectCartsByUserId(1);
        System.out.println(cartVos);
    }

}
