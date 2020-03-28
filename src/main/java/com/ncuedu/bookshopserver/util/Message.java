package com.ncuedu.bookshopserver.util;

import lombok.Data;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/28 22:17
 **/
@Data
public class Message {

    private Object data;

    private Integer code;

    public Message(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }
}
