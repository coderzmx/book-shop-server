package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.AdminVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/23 21:35
 **/
public interface AdminVoMapper {

    AdminVo selectAdminVoById(@Param("id") Integer id);

    List<AdminVo> selectAdmins(@Param("adminName") String adminName);
}
