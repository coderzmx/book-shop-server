package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.vo.AccessVo;
import com.ncuedu.bookshopserver.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 16:47
 **/
@RestController
public class AccessController {

    @Autowired
    private AccessService accessService;

    @GetMapping("/accesses")
    List<AccessVo> getAccesses(){
        return accessService.getAccesses();
    }
}
