package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.OrderitemVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/18 21:28
 **/
public interface OrderitemVoMapper {

    List<OrderitemVo> selectOrderitemByOrderIdAndState(@Param("orderId") String orderId,@Param("state") Integer state);
}
