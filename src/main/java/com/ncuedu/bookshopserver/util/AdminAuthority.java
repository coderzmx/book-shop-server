package com.ncuedu.bookshopserver.util;

import com.ncuedu.bookshopserver.pojo.vo.AccessVo;
import com.ncuedu.bookshopserver.pojo.vo.AdminVo;
import com.ncuedu.bookshopserver.pojo.vo.RoleVo;
import com.ncuedu.bookshopserver.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 21:59
 **/
@Component
public class AdminAuthority {

    @Autowired
    private AdminService adminService;
    @Autowired
    private RedisUtil redisUtil;

    public boolean checkAuthority(String adminToken,String uri){
        Integer id = (Integer) redisUtil.get(adminToken);
        AdminVo adminInfo = adminService.getAdminInfo(id);
        Set<String> uris=new HashSet<>();
        for (RoleVo role : adminInfo.getRoles()) {
            for (AccessVo access : role.getAccesses()) {
                uris.add(access.getAccessUri());
            }
        }
        return uris.contains(uri);
    }
}
