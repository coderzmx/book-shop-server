package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Role;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
import com.ncuedu.bookshopserver.service.RoleService;
import com.ncuedu.bookshopserver.util.AdminAuthority;
import com.ncuedu.bookshopserver.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 15:04
 **/
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private AdminAuthority authority;

    @GetMapping("/roles")
    public Message getRoles(String adminToken){
        if(adminToken==null||!authority.checkAuthority(adminToken,"/accesses")) return new Message(null,401);
        return new Message(roleService.getRoles(),200);
    }

    @PutMapping("/role")
    public Integer updateRole(@RequestBody RoleVo roleVo){
        return roleService.updateRole(roleVo);
    }

    @PostMapping("/role")
    public Integer addRole(@RequestBody RoleVo role){
        return roleService.addRole(role);
    }

    @DeleteMapping("/role/{id}")
    public Integer deleteRole(@PathVariable("id") Integer id){
        return roleService.deleteRole(id);
    }
}
