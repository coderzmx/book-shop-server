package com.ncuedu.bookshopserver;

import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.vo.*;
import com.ncuedu.bookshopserver.util.AdminAuthority;
import com.ncuedu.bookshopserver.util.RandomNumber;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BookShopServerApplicationTests {
    @Resource
    private AdminAuthority authority;
    @Test
    void test(){
        System.out.println(authority.checkAuthority("f79e221c-44f4-4843-9ce4-b4bbebff7bfb","/books"));
    }

}
