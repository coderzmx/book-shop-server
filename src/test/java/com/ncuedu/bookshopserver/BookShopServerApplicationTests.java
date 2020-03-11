package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BookShopServerApplicationTests {

    @Resource
    private BookVoMapper bookVoMapper;

    @Resource
    private BookRankVoMapper bookRankVoMapper;

    @Test
    public void test(){
        BookRankVo bookRankVo = bookRankVoMapper.selectByBookId(8, 28);
        System.out.println(bookRankVo);
    }

}
