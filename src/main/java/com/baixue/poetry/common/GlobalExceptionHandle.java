package com.baixue.poetry.common;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;


@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GlobalExceptionHandle {

    //SQL异常
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public Response<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());

        if(ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            String msg = split[2] + "已存在！";
            return Response.error(msg);
        }
        return Response.error("添加失败");
    }

    //业务异常
    @ExceptionHandler(CustomException.class)
    public Response<String> exceptionHandler(CustomException ex){
        log.error(ex.getMessage());

        return Response.error(ex.getMessage());
    }

}
