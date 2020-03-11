package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.BookVoMapper;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BookShopServerApplicationTests {

    @Resource
    private BookVoMapper bookVoMapper;


}
