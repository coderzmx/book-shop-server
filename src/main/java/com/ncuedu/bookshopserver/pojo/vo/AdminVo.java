package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Admin;
import lombok.Data;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 21:24
 **/
@Data
public class AdminVo extends Admin {
    private List<RoleVo> roles;

    @Override
    public String toString() {
        return "AdminVo{" +
                super.toString()+
                "roles=" + roles +
                '}';
    }
}
