package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.AccessMapper;
import com.ncuedu.bookshopserver.pojo.vo.AccessVo;
import com.ncuedu.bookshopserver.service.AccessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 16:46
 **/
@Service
public class AccessServiceImpl implements AccessService {

    @Resource
    private AccessMapper accessMapper;

    @Override
    public List<AccessVo> getAccesses() {
        return accessMapper.selectByExample(null);
    }
}
