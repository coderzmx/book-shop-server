package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.User;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/11/27 17:44
 **/
public interface UserService {

    User getUserByNameAndPassword(User user);

    boolean checkUserName(String userName);

    boolean checkUserTel(String userTel);

    Integer insertUser(User user);

    Integer updateUser(User user);
}
