package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Role;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
import com.ncuedu.bookshopserver.service.RoleService;
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

    @GetMapping("/roles")
    public List<RoleVo> getRoles(){
        return roleService.getRoles();
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
