package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.mapper.CommentVoMapper;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
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

    @Test
    public void test(){
        List<CommentVo> comments = commentVoMapper.selectByFilterCondition(4,1);
        System.out.println(comments);
    }

}
