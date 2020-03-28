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
    private AdminVoMapper adminVoMapper;
    @Resource
    private CateVoMapper cateVoMapper;
    @Resource
    private AdminOrderitemMapper adminOrderitemMapper;
    @Resource
    private RoleVoMapper roleVoMapper;
    @Resource
    private AccessMapper accessMapper;
    @Test
    void test(){
        List<AccessVo> accessVos = accessMapper.selectByExample(null);
        System.out.println(accessVos);
    }

}
