package com.qianfeng.springbootmybaties.entity;

import lombok.Data;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
@Data
public class ResultBean<T> {
    private String responseCode;
    private T data;
}
