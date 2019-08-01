package com.qianfeng.springbootmybaties.entity;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;
@Data
public class TUser {
    @Null//属性必须为空
    private Long id;
    @NotNull//属性不能为空
    private String username;
    @Past//属性的时间值必须为过去的
    private Date entryDate;
    //regexp的值要是正则表达式，message是不满足regexp值的提示信息
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式有误")
    private String password;
    @Max(150)
    private Integer age;

   }