package com.ncuedu.bookshopserver.pojo;

import lombok.Data;

import java.util.Objects;

@Data
public class RoleAccess {
    private Integer roleAccessId;

    private Integer roleId;

    private Integer accessId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleAccess that = (RoleAccess) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(accessId, that.accessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, accessId);
    }

    public RoleAccess(Integer roleId, Integer accessId) {
        this.roleId = roleId;
        this.accessId = accessId;
    }
}