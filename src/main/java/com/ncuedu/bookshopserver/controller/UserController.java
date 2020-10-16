package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.User;
import com.ncuedu.bookshopserver.pojo.vo.UserVo;
import com.ncuedu.bookshopserver.service.UserService;
import com.ncuedu.bookshopserver.util.GetMessageCode;
import com.ncuedu.bookshopserver.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    public Map<String,Object> login(@RequestBody UserVo user){
        User userDetail = userService.getUserByNameAndPassword(user);
        return saveUserInfo(userDetail);
    }

    @PostMapping("/user/loginTel")
    public Map<String,Object> loginTel(@RequestBody UserVo user){
        String code = (String) redisUtil.get(user.getUserTel());
        User userDetail=null;
        if(code!=null&&code.equals(user.getCode())){
            userDetail = userService.getUserByTel(user.getUserTel());
        }
        return saveUserInfo(userDetail);
    }

    private Map<String,Object> saveUserInfo(User user){
        Map<String,Object> result=new HashMap<>();
        result.put("code",0);
        if(user!=null){
            String key= UUID.randomUUID().toString();
            redisUtil.set(key,user);
            result.put("code",200);
            result.put("token",key);
            result.put("userInfo",user);
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
        String code =(String) redisUtil.get(userVo.getUserTel());//在redis上取出发送的验证码
        Map<String,Object> result=new HashMap<>();//用于封装返回结果
        if(!userVo.getCode().equals(code)){//判断用户输入的验证码是否正确
            result.put("code",400);
            return result;
        }
        User user=new User(userVo.getUserName(),userVo.getUserPassword(),userVo.getUserTel());
        user.setUserImg("head_default.jpg");
        user.setUserMoney(new BigDecimal(10000));
        user.setUserNickname("无昵称用户");
        user.setUserSex("男");
        Integer insertResult = userService.insertUser(user);//将用户信息插入数据库中
        if(insertResult==1){//判断数据库插入是否成功
            String key= UUID.randomUUID().toString();//生成UUID
            redisUtil.set(key,user);//将用户信息存储在redis中
            result.put("token",key);
            result.put("userInfo",user);//将token和用户信息返回到前端
        }
        result.put("code",insertResult);//封装操作结果
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

    @GetMapping("/admin/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
}
