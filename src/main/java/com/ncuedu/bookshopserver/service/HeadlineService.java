package com.ncuedu.bookshopserver.service;

import com.ncuedu.bookshopserver.pojo.Headline;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 17:34
 **/
public interface HeadlineService {

    List<Headline> getLatestHeadlines();
}
