package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Access;
import lombok.Data;

import java.util.Objects;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 15:21
 **/
@Data
public class AccessVo extends Access {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AccessVo accessVo = (AccessVo) o;
        return isSelected == accessVo.isSelected;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSelected);
    }

    private boolean isSelected;

    @Override
    public String toString() {
        return "AccessVo{" +
                super.toString()+
                "isSelected=" + isSelected +
                '}';
    }
}
