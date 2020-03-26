package com.ncuedu.bookshopserver.service;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.vo.CateVo;

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

    PageInfo<CateVo> getAllCates(Integer page,String cateName,String parentId);

    Integer updateCate(Cate cate);

    Integer addCate(Cate cate);

    Integer deleteCate(Integer cateId);
}
