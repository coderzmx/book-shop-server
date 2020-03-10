package com.ncuedu.bookshopserver.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/11/30 16:02
 **/
@Component
public class RedisUtil {

    private static final int ttl=60*24*30;//minutes

    @Autowired
    private RedisTemplate redisTemplate;

    public void set(Object key,Object value){
        redisTemplate.opsForValue().set(key,value, ttl,TimeUnit.MINUTES);
    }

    public Object get(Object key){
        return redisTemplate.opsForValue().get(key);
    }
}
