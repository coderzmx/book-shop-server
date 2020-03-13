package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.CartVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/13 23:20
 **/
public interface CartVoMapper {
    List<CartVo> selectCartsByUserId(@Param("userId") Integer userId);
}
