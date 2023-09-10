package com.baixue.poetry.common;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

import java.io.Serializable;

/**
 * 简单的返回类
 * @param <T>
 */
@Data
public class Response<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public static <T> Response<T> success(T object){
        Response<T> r =new Response<T>();
        r.code=1;
        r.data=object;
        return r;

    }

    public static <T> Response<T> error(String msg){
        Response<T> r =new Response<T>();
        r.code=0;
        r.msg=msg;
        return r;

    }

}
