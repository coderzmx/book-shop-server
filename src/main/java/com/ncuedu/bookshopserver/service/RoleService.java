package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Role;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 15:03
 **/
public interface RoleService {
    List<RoleVo> getRoles();

    Integer updateRole(RoleVo role);

    Integer addRole(RoleVo role);

    Integer deleteRole(Integer id);
}
