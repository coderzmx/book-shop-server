package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.vo.BookRankVo;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/11 21:54
 **/
public interface BookRankVoMapper {

    BookRankVo selectByBookId(@Param("bookId") Integer bookId,@Param("cateId") Integer cateId);
}
