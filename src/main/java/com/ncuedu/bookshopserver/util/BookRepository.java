package com.ncuedu.bookshopserver.util;

import com.ncuedu.bookshopserver.pojo.vo.BookVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/29 15:43
 **/
public interface BookRepository extends ElasticsearchRepository<BookVo,Long> {
}
