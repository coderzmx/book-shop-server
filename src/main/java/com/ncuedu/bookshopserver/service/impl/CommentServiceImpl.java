package com.ncuedu.bookshopserver.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ncuedu.bookshopserver.mapper.CommentMapper;
import com.ncuedu.bookshopserver.mapper.CommentVoMapper;
import com.ncuedu.bookshopserver.pojo.Comment;
import com.ncuedu.bookshopserver.pojo.CommentExample;
import com.ncuedu.bookshopserver.pojo.vo.CommentVo;
import com.ncuedu.bookshopserver.service.CommentService;
import com.ncuedu.bookshopserver.util.Define;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/12 20:59
 **/
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;
    @Resource
    private CommentVoMapper commentVoMapper;
    @Override
    public Map<String,Object> getCommentCountByBookId(Integer bookId) {
        Map<String,Object> result=new HashMap<>();
        CommentExample commentExample = new CommentExample();
        commentExample.or().andBookIdEqualTo(1).andCommentGradeGreaterThan(3);
        result.put("good",commentMapper.selectByExample(commentExample).size());
        CommentExample commentExample1 = new CommentExample();
        commentExample1.or().andBookIdEqualTo(1).andCommentGradeEqualTo(3);
        result.put("normal",commentMapper.selectByExample(commentExample1).size());
        CommentExample commentExample2 = new CommentExample();
        commentExample2.or().andBookIdEqualTo(1).andCommentGradeLessThan(3);
        result.put("bad",commentMapper.selectByExample(commentExample2).size());
        return result;
    }

    @Override
    public PageInfo<CommentVo> getCommentByCondition(Integer condition,Integer bookId,Integer currentPage) {
        if(currentPage==null) currentPage=1;
        PageHelper.startPage(currentPage, Define.PAGE_SIZE);
        PageInfo<CommentVo> comments=new PageInfo<>(commentVoMapper.selectByFilterCondition(condition,bookId));
        return comments;
    }
}
