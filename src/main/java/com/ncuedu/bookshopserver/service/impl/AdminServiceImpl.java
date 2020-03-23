package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.AccessMapper;
import com.ncuedu.bookshopserver.mapper.AdminMapper;
import com.ncuedu.bookshopserver.mapper.AdminVoMapper;
import com.ncuedu.bookshopserver.mapper.RoleMapper;
import com.ncuedu.bookshopserver.pojo.Admin;
import com.ncuedu.bookshopserver.pojo.AdminExample;
import com.ncuedu.bookshopserver.pojo.vo.AdminVo;
import com.ncuedu.bookshopserver.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 15:22
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private AdminVoMapper adminVoMapper;
    @Override
    public Integer login(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.or().andAdminNameEqualTo(admin.getAdminName()).andAdminPasswordEqualTo(admin.getAdminPassword());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.size()>0?admins.get(0).getAdminId():0;
    }

    @Override
    public AdminVo getAdminInfo(Integer adminId) {
        return adminVoMapper.selectAdminVoById(adminId);
    }
}
