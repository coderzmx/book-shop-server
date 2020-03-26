package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.AdminOrderItemVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/26 19:42
 **/
public interface AdminOrderitemMapper {

    List<AdminOrderItemVo> selectOrders(@Param("userName") String userName,@Param("bookTitle") String bookTitle,@Param("orderitemState") String orderitemState);
}
