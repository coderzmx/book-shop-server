package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.User;
import com.ncuedu.bookshopserver.pojo.vo.UserVo;
import com.ncuedu.bookshopserver.service.UserService;
import com.ncuedu.bookshopserver.util.GetMessageCode;
import com.ncuedu.bookshopserver.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/11/27 17:35
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/user/login")
    public Map<String,Object> login(@RequestBody User user){
        User userDetail = userService.getUserByNameAndPassword(user);
        Map<String,Object> result=new HashMap<>();
        result.put("code",0);
        if(userDetail!=null){
            String key= UUID.randomUUID().toString();
            redisUtil.set(key,userDetail);
            result.put("code",200);
            result.put("token",key);
            result.put("userInfo",userDetail);
        }
        return result;
    }

    @PostMapping("/user/getUserInfo")
    public Map<String,Object> getUserInfo(@RequestBody String token){
        Object result = redisUtil.get(token);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        if(result!=null){
            map.put("userInfo",result);
            map.put("code",200);
        }
        return map;
    }

    @GetMapping("/user/checkUserName")
    public boolean checkUserName(String userName){
        return userService.checkUserName(userName);
    }

    @GetMapping("/user/checkUserTel")
    public boolean checkUserTel(String userTel){
        return userService.checkUserTel(userTel);
    }

    @PostMapping("/user/getCode")
    public void getCode(@RequestBody UserVo userVo){
        String userTel = userVo.getUserTel();
        String code = GetMessageCode.getCode(userTel);
        redisUtil.set(userTel,code);
    }

    @PostMapping("/user/register")
    public Map<String, Object> register(@RequestBody UserVo userVo){
        String code =(String) redisUtil.get(userVo.getUserTel());
        Map<String,Object> result=new HashMap<>();
        if(!userVo.getCode().equals(code)){
            result.put("code",400);
        }
        User user=new User(userVo.getUserName(),userVo.getUserPassword(),userVo.getUserTel());
        Integer insertResult = userService.insertUser(user);
        if(insertResult==1){
            String key= UUID.randomUUID().toString();
            redisUtil.set(key,user);
            result.put("token",key);
            result.put("userInfo",user);
        }
        result.put("code",insertResult);
        return result;
    }

    @PutMapping("/user")
    public Integer saveUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/user/checkCode")
    public Integer checkCode(@RequestBody UserVo userVo){
        String code=(String) redisUtil.get(userVo.getUserTel());
        return code.equals(userVo.getCode())?1:0;
    }
}
