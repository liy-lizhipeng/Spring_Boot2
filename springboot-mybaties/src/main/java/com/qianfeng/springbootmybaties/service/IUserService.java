package com.qianfeng.springbootmybaties.service;

import com.qianfeng.springbootmybaties.entity.TUser;

import java.util.List;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
public interface IUserService {
    TUser getUserById(Long id);

    List<TUser> getUserList();
}
