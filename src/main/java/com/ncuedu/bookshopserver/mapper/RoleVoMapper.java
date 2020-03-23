package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 21:49
 **/
public interface RoleVoMapper {
    RoleVo selectRoleByAdminId(@Param("id") Integer id);
}
