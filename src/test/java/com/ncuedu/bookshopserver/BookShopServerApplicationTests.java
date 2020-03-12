package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookRankVoMapper;
import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
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

    @Test
    public void test(){
        List<BookVo> bookVos = bookVoMapper.selectOtherTopRankBookByCateId(28, 1);
        System.out.println(bookVos);
    }

}
