package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;
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

    @Test
    public void test(){

    }

}
