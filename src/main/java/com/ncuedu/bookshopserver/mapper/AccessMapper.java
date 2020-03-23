package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.Access;
import com.ncuedu.bookshopserver.pojo.AccessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessMapper {
    long countByExample(AccessExample example);

    int deleteByExample(AccessExample example);

    int deleteByPrimaryKey(Integer accessId);

    int insert(Access record);

    int insertSelective(Access record);

    List<Access> selectByExample(AccessExample example);

    Access selectByPrimaryKey(Integer accessId);

    int updateByExampleSelective(@Param("record") Access record, @Param("example") AccessExample example);

    int updateByExample(@Param("record") Access record, @Param("example") AccessExample example);

    int updateByPrimaryKeySelective(Access record);

    int updateByPrimaryKey(Access record);

    List<Access> selectAccessByRoleId(@Param("id") Integer id);
}