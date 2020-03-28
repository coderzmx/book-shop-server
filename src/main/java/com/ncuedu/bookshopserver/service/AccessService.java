package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.vo.AccessVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 16:45
 **/
public interface AccessService {

    List<AccessVo> getAccesses();
}
