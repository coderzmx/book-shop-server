package com.ncuedu.bookshopserver.controller;

import com.ncuedu.bookshopserver.pojo.Headline;
import com.ncuedu.bookshopserver.service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 17:44
 **/
@RestController
public class HeadlineController {

    @Autowired
    private HeadlineService headlineService;

    @GetMapping("/headline/latestHeadlines")
    public List<Headline> latestHeadlines(){
        return headlineService.getLatestHeadlines();
    }
}
