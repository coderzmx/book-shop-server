package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 15:40
 **/
@RestController
public class CateController {

    @Autowired
    private CateService cateService;

    @GetMapping("/cate/getCatesByPid")
    public List<Cate> getCatesByPid(Integer pid){
        return cateService.getCatesByPid(pid);
    }

    @GetMapping("/cate/getFirstCates")
    public List<Cate> getFirstCates(){
        return cateService.getAllFirstCates();
    }

    @GetMapping("/cate/getFirstBySecondId")
    public Cate getFirstBySecondId(Integer id){
        return cateService.getFirstCateBySecondCateId(id);
    }

    @GetMapping("/cate/secondCates")
    public List<Cate> getAllSecondCates(){
        return cateService.getAllSecondCates();
    }
}
