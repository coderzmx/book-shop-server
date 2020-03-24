package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.User;
import com.ncuedu.bookshopserver.pojo.vo.UserVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/11/27 17:44
 **/
public interface UserService {

    User getUserByNameAndPassword(UserVo user);

    User getUserByTel(String tel);

    boolean checkUserName(String userName);

    boolean checkUserTel(String userTel);

    Integer insertUser(User user);

    Integer updateUser(User user);
}
