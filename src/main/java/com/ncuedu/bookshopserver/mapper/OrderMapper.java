package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.Order;
import com.ncuedu.bookshopserver.pojo.OrderExample;
import com.ncuedu.bookshopserver.pojo.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<OrderVo> selectOrderVoByUserIdAndOrderitemState(@Param("userId") Integer userId,@Param("state") Integer state);
}