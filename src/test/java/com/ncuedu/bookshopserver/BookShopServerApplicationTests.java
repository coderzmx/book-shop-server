package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BookShopServerApplicationTests {

    @Resource
    private BookVoMapper bookVoMapper;

    @Test
    void test(){
        List<Integer> ids=new ArrayList<>();
        ids.add(28);
        ids.add(29);
        List<BookVo> bookVos = bookVoMapper.selectByFirstCateId(ids);
        System.out.println(bookVos.size());
    }

}
