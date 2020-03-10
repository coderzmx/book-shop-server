package com.ncuedu.bookshopserver.service.impl;

import com.ncuedu.bookshopserver.mapper.CateMapper;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.CateExample;
import com.ncuedu.bookshopserver.service.CateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/6 15:41
 **/
@Service
public class CateServiceImpl implements CateService {

    @Resource
    private CateMapper cateMapper;

    @Override
    public List<Cate> getCatesByPid(Integer pid) {
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(pid);
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        return cates;
    }

    @Override
    public List<Cate> getAllFirstCates() {
        CateExample cateExample = new CateExample();
        CateExample.Criteria criteria = cateExample.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<Cate> cates = cateMapper.selectByExample(cateExample);
        return cates;
    }

    @Override
    public Cate getFirstCateBySecondCateId(Integer id) {
        Cate secondCate = cateMapper.selectByPrimaryKey(id);
        Cate firstCate = cateMapper.selectByPrimaryKey(secondCate.getParentId());
        return firstCate;
    }
}
