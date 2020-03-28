package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Access;
import com.ncuedu.bookshopserver.pojo.Role;
import lombok.Data;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 21:23
 **/
@Data
public class RoleVo extends Role {
    private List<AccessVo> accesses;

    @Override
    public String toString() {
        return "RoleVo{" +
                super.toString()+
                "accesses=" + accesses +
                '}';
    }
}
