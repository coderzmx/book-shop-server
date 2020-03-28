package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.*;
import com.ncuedu.bookshopserver.pojo.*;
import com.ncuedu.bookshopserver.pojo.vo.AccessVo;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
import com.ncuedu.bookshopserver.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 15:04
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleVoMapper roleVoMapper;
    @Resource
    private AccessMapper accessMapper;
    @Resource
    private RoleAccessMapper roleAccessMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private AdminRoleMapper adminRoleMapper;

    @Override
    public List<RoleVo> getRoles() {
        List<RoleVo> roles = roleVoMapper.selectAllRoles();
        for (RoleVo role : roles) {
            List<AccessVo> accesses = role.getAccesses();
            List<AccessVo> allAccesses = accessMapper.selectByExample(null);
            for (AccessVo access : allAccesses) {
                if(accesses.indexOf(access)!=-1){
                    access.setSelected(true);
                }
            }
            role.setAccesses(allAccesses);
        }
        return roles;
    }

    @Override
    public Integer updateRole(RoleVo roleVo) {
        Role role = new Role(roleVo.getRoleId(), roleVo.getRoleName(), roleVo.getRoleDesc(), roleVo.getRoleCreateTime(), roleVo.getRoleUpdateTime());
        roleMapper.updateByPrimaryKey(role);
        List<AccessVo> accesses = roleVo.getAccesses();
        RoleAccessExample roleAccessExample = new RoleAccessExample();
        roleAccessExample.or().andRoleIdEqualTo(role.getRoleId());
        List<RoleAccess> roleAccesses = roleAccessMapper.selectByExample(roleAccessExample);
        for (AccessVo access : accesses) {
            RoleAccess roleAccess = new RoleAccess(role.getRoleId(), access.getAccessId());
            if(access.isSelected()&&roleAccesses.indexOf(roleAccess)==-1){
                roleAccessMapper.insertSelective(roleAccess);
            }
            if(!access.isSelected()){
                roleAccessExample.clear();
                roleAccessExample.or().andRoleIdEqualTo(role.getRoleId()).andAccessIdEqualTo(access.getAccessId());
                roleAccessMapper.deleteByExample(roleAccessExample);
            }
        }
        return 1;
    }

    @Override
    public Integer addRole(RoleVo roleVo) {
        Role role = new Role(roleVo.getRoleName(), roleVo.getRoleDesc(), roleVo.getRoleCreateTime(), roleVo.getRoleUpdateTime());
        roleMapper.insertSelective(role);
        List<AccessVo> accesses = roleVo.getAccesses();
        for (AccessVo access : accesses) {
            if(access.isSelected()){
                RoleAccess roleAccess = new RoleAccess(role.getRoleId(), access.getAccessId());
                roleAccessMapper.insertSelective(roleAccess);
            }
        }
        return role.getRoleId();
    }

    @Override
    public Integer deleteRole(Integer id) {
        AdminRoleExample adminRoleExample = new AdminRoleExample();
        adminRoleExample.or().andRoleIdEqualTo(id);
        List<AdminRole> adminRoles = adminRoleMapper.selectByExample(adminRoleExample);
        if(adminRoles.size()>0) return 0;
        else return roleMapper.deleteByPrimaryKey(id);
    }
}
