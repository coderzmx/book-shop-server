package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 19:31
 **/
public interface BookVoMapper {

    List<BookVo> selectAllByCondition(Integer condition);

    List<BookVo> selectBySecondCateIdAndCondition(@Param("id") Integer id,@Param("condition") Integer condition);

    List<BookVo> selectByFirstCateIdAndCondition(List<Integer> ids,@Param("condition") Integer condition);

    BookVo selectBookById(Integer id);

    List<BookVo> selectOtherTopRankBookByCateId(@Param("cateId") Integer cateId,@Param("bookId") Integer bookId);
}
