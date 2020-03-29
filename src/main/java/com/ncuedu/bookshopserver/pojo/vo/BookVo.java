package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Book;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/12/18 16:38
 **/
@Data
@Document(indexName = "book",type = "doc", shards = 1, replicas = 0)
public class BookVo extends Book implements Serializable {

    @Field(type = FieldType.Keyword)
    private String authorName;

    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String cateName;

    @Override
    public String toString() {
        return "BookVo{" +
                "authorName='" + authorName + '\'' +
                super.toString()+
                '}';
    }
}
