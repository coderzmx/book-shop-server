package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.Book;
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
    @Resource
    private AuthorMapper authorMapper;
    @Resource
    private BookMapper bookMapper;
    @Test
    public void test(){
        List<Book> books = bookMapper.selectPopularBooksByAuthorId(18, 4);
        System.out.println(books);
    }

}
