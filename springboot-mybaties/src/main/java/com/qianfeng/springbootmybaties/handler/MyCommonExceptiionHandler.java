package com.qianfeng.springbootmybaties.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
@ControllerAdvice
public class MyCommonExceptiionHandler {

    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(Exception e){
        return new ResultBean("500",e.getMessage());
    }*/
}
