package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Access;
import com.ncuedu.bookshopserver.pojo.Role;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 21:23
 **/
@Data
public class RoleVo extends Role {
    private List<AccessVo> accesses;

    private boolean isSelected;

    @Override
    public String toString() {
        return "RoleVo{" +
                super.toString()+
                "accesses=" + accesses +
                ", isSelected=" + isSelected +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoleVo roleVo = (RoleVo) o;
        return isSelected == roleVo.isSelected;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSelected);
    }
}
