package com.ncuedu.bookshopserver.mapper;

import com.ncuedu.bookshopserver.pojo.Book;
import com.ncuedu.bookshopserver.pojo.vo.BookVo;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 19:31
 **/
public interface BookVoMapper {

    List<BookVo> selectAll();

    List<BookVo> selectBySecondCateId(Integer id);

    List<BookVo> selectByFirstCateId(List<Integer> ids);
}
