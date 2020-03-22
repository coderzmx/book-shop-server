package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.RoleAccess;
import com.ncuedu.bookshopserver.pojo.RoleAccessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleAccessMapper {
    long countByExample(RoleAccessExample example);

    int deleteByExample(RoleAccessExample example);

    int deleteByPrimaryKey(Integer roleAccessId);

    int insert(RoleAccess record);

    int insertSelective(RoleAccess record);

    List<RoleAccess> selectByExample(RoleAccessExample example);

    RoleAccess selectByPrimaryKey(Integer roleAccessId);

    int updateByExampleSelective(@Param("record") RoleAccess record, @Param("example") RoleAccessExample example);

    int updateByExample(@Param("record") RoleAccess record, @Param("example") RoleAccessExample example);

    int updateByPrimaryKeySelective(RoleAccess record);

    int updateByPrimaryKey(RoleAccess record);
}