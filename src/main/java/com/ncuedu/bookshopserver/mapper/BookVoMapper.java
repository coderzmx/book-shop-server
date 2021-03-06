package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 19:31
 **/
public interface BookVoMapper {
    //2销量，3售价，4出版时间
    List<BookVo> selectAllByCondition(Integer condition);

    List<BookVo> selectBySecondCateIdAndCondition(@Param("id") Integer id,@Param("condition") Integer condition);

    List<BookVo> selectByFirstCateIdAndCondition(@Param("ids") List<Integer> ids,@Param("condition") Integer condition);

    BookVo selectBookById(Integer id);

    List<BookVo> selectOtherTopRankBookByCateId(@Param("cateId") Integer cateId,@Param("bookId") Integer bookId);

    List<BookVo> selectBooksByCondition(Map<String,Object> map);
}
