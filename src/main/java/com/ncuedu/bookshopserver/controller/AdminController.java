package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Admin;
import com.ncuedu.bookshopserver.pojo.vo.AdminVo;
import com.ncuedu.bookshopserver.service.AdminService;
import com.ncuedu.bookshopserver.util.AdminAuthority;
import com.ncuedu.bookshopserver.util.Message;
import com.ncuedu.bookshopserver.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 15:24
 **/
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private AdminAuthority authority;
    @PostMapping("/login")
    public String login(@RequestBody Admin admin){
        Integer result = adminService.login(admin);
        if(result==0) return "0";
        else{
            String key= UUID.randomUUID().toString();
            redisUtil.set(key,result);
            return key;
        }
    }

    @GetMapping("/admin/{token}")
    public AdminVo getAdminById(@PathVariable("token") String token){
        Integer id = (Integer) redisUtil.get(token);
        return adminService.getAdminInfo(id);
    }

    @GetMapping("/admins")
    public Message getAdmins(Integer page,String adminName,String adminToken){
        if(adminToken==null||!authority.checkAuthority(adminToken,"/accesses")) return new Message(null,401);
        return new Message(adminService.getAdmins(page,adminName),200);
    }

    @PutMapping("/admin")
    public Integer updateAdmin(@RequestBody AdminVo adminVo){
        return adminService.updateAdmin(adminVo);
    }

    @PostMapping("/admin")
    public Integer addAdmin(@RequestBody AdminVo adminVo){
        return adminService.addAdmin(adminVo);
    }

    @DeleteMapping("/admin/{id}")
    public Integer deleteAdmin(@PathVariable("id") Integer id){
        return adminService.deleteAdmin(id);
    }
}
