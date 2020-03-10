package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.Headline;
import com.ncuedu.bookshopserver.pojo.HeadlineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeadlineMapper {
    long countByExample(HeadlineExample example);

    int deleteByExample(HeadlineExample example);

    int deleteByPrimaryKey(Integer headlineId);

    int insert(Headline record);

    int insertSelective(Headline record);

    List<Headline> selectByExample(HeadlineExample example);

    Headline selectByPrimaryKey(Integer headlineId);

    int updateByExampleSelective(@Param("record") Headline record, @Param("example") HeadlineExample example);

    int updateByExample(@Param("record") Headline record, @Param("example") HeadlineExample example);

    int updateByPrimaryKeySelective(Headline record);

    int updateByPrimaryKey(Headline record);

    List<Headline> selectLatestHeadlines();
}