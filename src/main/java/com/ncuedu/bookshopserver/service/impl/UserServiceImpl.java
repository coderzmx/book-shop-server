package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.UserMapper;
import com.ncuedu.bookshopserver.pojo.User;
import com.ncuedu.bookshopserver.pojo.UserExample;
import com.ncuedu.bookshopserver.pojo.vo.UserVo;
import com.ncuedu.bookshopserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/11/27 17:44
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPassword(UserVo user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName()).andUserPasswordEqualTo(user.getUserPassword());
        List<User> users = userMapper.selectByExample(userExample);
        return users.size()>0?users.get(0):null;
    }

    @Override
    public User getUserByTel(String tel) {
        UserExample userExample = new UserExample();
        userExample.or().andUserTelEqualTo(tel);
        List<User> users = userMapper.selectByExample(userExample);
        return users.size()>0?users.get(0):null;
    }

    @Override
    public boolean checkUserName(String userName) {
        UserExample userExample = new UserExample();
        userExample.or().andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        return users.size()>0;
    }

    @Override
    public boolean checkUserTel(String userTel) {
        UserExample userExample = new UserExample();
        userExample.or().andUserTelEqualTo(userTel);
        List<User> users = userMapper.selectByExample(userExample);
        return users.size()>0;
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
