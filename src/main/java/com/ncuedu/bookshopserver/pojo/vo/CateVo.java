package com.ncuedu.bookshopserver.pojo.vo;

import com.ncuedu.bookshopserver.pojo.Cate;
import lombok.Data;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/26 14:55
 **/
@Data
public class CateVo extends Cate {
    private String parentName;
}
