package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.BookMapper;
import com.ncuedu.bookshopserver.mapper.CateMapper;
import com.ncuedu.bookshopserver.mapper.CateVoMapper;
import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.BookExample;
import com.ncuedu.bookshopserver.pojo.Cate;
import com.ncuedu.bookshopserver.pojo.CateExample;
import com.ncuedu.bookshopserver.pojo.vo.CateVo;
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
    @Resource
    private CateVoMapper cateVoMapper;
    @Resource
    private BookMapper bookMapper;

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

    @Override
    public List<Cate> getAllSecondCates() {
        CateExample cateExample = new CateExample();
        cateExample.or().andParentIdNotEqualTo(0);
        return cateMapper.selectByExample(cateExample);
    }

    @Override
    public PageInfo<CateVo> getAllCates(Integer page,String cateName,String parentId) {
        if(page==null) page=1;
        PageHelper.startPage(page,10);
        PageInfo<CateVo> cates=new PageInfo<>(cateVoMapper.selectAllCates(cateName, parentId));
        return cates;
    }

    @Override
    public Integer updateCate(Cate cate) {
        return cateMapper.updateByPrimaryKeySelective(cate);
    }

    @Override
    public Integer addCate(Cate cate) {
        return cateMapper.insertSelective(cate);
    }

    @Override
    public Integer deleteCate(Integer cateId) {
        BookExample bookExample = new BookExample();
        bookExample.or().andCateIdEqualTo(cateId);
        List<Book> books = bookMapper.selectByExample(bookExample);
        if(books.size()>0){
            return 0;
        }else{
            CateExample cateExample = new CateExample();
            cateExample.or().andParentIdEqualTo(cateId);
            List<Cate> cates = cateMapper.selectByExample(cateExample);
            if(cates.size()>0){
                return 1;
            }else{
                cateMapper.deleteByPrimaryKey(cateId);
                return 2;
            }
        }
    }
}
