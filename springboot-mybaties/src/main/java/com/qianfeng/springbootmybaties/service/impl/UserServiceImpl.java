package com.qianfeng.springbootmybaties.service.impl;

import com.qianfeng.springbootmybaties.entity.TUser;
import com.qianfeng.springbootmybaties.mapper.TUserMapper;
import com.qianfeng.springbootmybaties.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TUser> getUserList() {
        return userMapper.getUserList();
    }
}
