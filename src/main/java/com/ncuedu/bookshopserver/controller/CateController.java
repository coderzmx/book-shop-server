package com.ncuedu.bookshopserver.controller;

import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.vo.CateVo;
import com.ncuedu.bookshopserver.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/admin/cates")
    public PageInfo<CateVo> getAllCates(Integer page,String cateName,String parentId){
        return cateService.getAllCates(page,cateName,parentId);
    }

    @PutMapping("/cate")
    public Integer updateCaet(@RequestBody Cate cate){
        return cateService.updateCate(cate);
    }

    @PostMapping("/cate")
    public Integer addCate(@RequestBody Cate cate){
        return cateService.addCate(cate);
    }

    @DeleteMapping("/cate/{cateId}")
    public Integer deleteCate(@PathVariable("cateId") Integer cateId){
        return cateService.deleteCate(cateId);
    }
}
