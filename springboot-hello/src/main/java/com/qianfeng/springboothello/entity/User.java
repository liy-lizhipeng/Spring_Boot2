package com.qianfeng.springboothello.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @Author Liy
 * @Date 2019/7/29
 */
public class User {
    //非空则返回
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String username;
    @JsonIgnore//不返回密码
    private String password;
//  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    /*时间格式的注解*/
//  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entryDate;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
