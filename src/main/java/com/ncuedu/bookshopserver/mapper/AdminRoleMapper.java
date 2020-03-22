package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.AdminRole;
import com.ncuedu.bookshopserver.pojo.AdminRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminRoleMapper {
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int deleteByPrimaryKey(Integer adminRoleId);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    AdminRole selectByPrimaryKey(Integer adminRoleId);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}