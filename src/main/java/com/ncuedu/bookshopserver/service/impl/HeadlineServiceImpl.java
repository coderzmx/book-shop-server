package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.HeadlineMapper;
import com.ncuedu.bookshopserver.pojo.Headline;
import com.ncuedu.bookshopserver.pojo.HeadlineExample;
import com.ncuedu.bookshopserver.service.HeadlineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 17:34
 **/
@Service
public class HeadlineServiceImpl implements HeadlineService {

    @Resource
    private HeadlineMapper headlineMapper;

    @Override
    public List<Headline> getLatestHeadlines() {
        return headlineMapper.selectLatestHeadlines();
    }
}
