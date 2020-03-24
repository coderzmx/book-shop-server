package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Cate;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 15:40
 **/
public interface CateService {

    List<Cate> getCatesByPid(Integer pid);

    List<Cate> getAllFirstCates();

    Cate getFirstCateBySecondCateId(Integer id);

    List<Cate>  getAllSecondCates();
}
