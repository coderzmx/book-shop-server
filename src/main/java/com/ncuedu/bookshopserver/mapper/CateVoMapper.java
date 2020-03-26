package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.CateVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/26 14:56
 **/
public interface CateVoMapper {

    List<CateVo> selectAllCates(@Param("cateName") String cateName,@Param("parentId") String parentId);
}
