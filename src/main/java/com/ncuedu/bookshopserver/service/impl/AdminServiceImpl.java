package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.Admin;
import com.ncuedu.bookshopserver.pojo.AdminExample;
import com.ncuedu.bookshopserver.pojo.AdminRole;
import com.ncuedu.bookshopserver.pojo.AdminRoleExample;
import com.ncuedu.bookshopserver.pojo.vo.AdminVo;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
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
    @Resource
    private RoleVoMapper roleVoMapper;
    @Resource
    private AdminRoleMapper adminRoleMapper;
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

    @Override
    public PageInfo<AdminVo> getAdmins(Integer page,String adminName) {
        if(page==null) page=1;
        PageHelper.startPage(page,10);
        PageInfo<AdminVo> admins=new PageInfo<>(adminVoMapper.selectAdmins(adminName));
        for (AdminVo admin : admins.getList()) {
            List<RoleVo> roles = admin.getRoles();
            List<RoleVo> allRoles = roleVoMapper.selectAllRoles();
            for (RoleVo role : allRoles) {
                if(roles.indexOf(role)!=-1){
                    role.setSelected(true);
                }
            }
            admin.setRoles(allRoles);
        }
        return admins;
    }

    @Override
    public Integer updateAdmin(AdminVo adminVo) {
        Admin admin = new Admin(adminVo.getAdminId(), adminVo.getAdminName(), adminVo.getAdminPassword(), adminVo.getAdminTel(), adminVo.getAdminEmail(), adminVo.getAdminIsSuper(), adminVo.getAdminCreateTime(), adminVo.getAdminUpdateTime());
        adminMapper.updateByPrimaryKeySelective(admin);
        AdminRoleExample adminRoleExample = new AdminRoleExample();
        adminRoleExample.or().andAdminIdEqualTo(admin.getAdminId());
        List<AdminRole> adminRoles = adminRoleMapper.selectByExample(adminRoleExample);
        List<RoleVo> roles = adminVo.getRoles();
        for (RoleVo role : roles) {
            AdminRole adminRole = new AdminRole(admin.getAdminId(), role.getRoleId());
            if(role.isSelected()&&adminRoles.indexOf(adminRole)==-1){
                adminRoleMapper.insertSelective(adminRole);
            }
            if(!role.isSelected()){
                adminRoleExample.clear();
                adminRoleExample.or().andRoleIdEqualTo(role.getRoleId()).andAdminIdEqualTo(admin.getAdminId());
                adminRoleMapper.deleteByExample(adminRoleExample);
            }
        }
        return 1;
    }

    @Override
    public Integer addAdmin(AdminVo adminVo) {
        Admin admin = new Admin(adminVo.getAdminName(), adminVo.getAdminPassword(), adminVo.getAdminTel(), adminVo.getAdminEmail(), adminVo.getAdminIsSuper(), adminVo.getAdminCreateTime(), adminVo.getAdminUpdateTime());
        adminMapper.insertSelective(admin);
        for (RoleVo role : adminVo.getRoles()) {
            if(role.isSelected()){
                AdminRole adminRole = new AdminRole(admin.getAdminId(), role.getRoleId());
                adminRoleMapper.insertSelective(adminRole);
            }
        }
        return admin.getAdminId();
    }

    @Override
    public Integer deleteAdmin(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }
}
