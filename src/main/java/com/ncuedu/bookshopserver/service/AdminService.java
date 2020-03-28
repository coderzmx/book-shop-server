package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Admin;
import com.ncuedu.bookshopserver.pojo.vo.AdminVo;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 15:19
 **/
public interface AdminService {
    Integer login(Admin admin);

    AdminVo getAdminInfo(Integer adminId);

    PageInfo<AdminVo> getAdmins(Integer page,String adminName);

    Integer updateAdmin(AdminVo adminVo);

    Integer addAdmin(AdminVo adminVo);

    Integer deleteAdmin(Integer id);
}
