package com.qianfeng.springbootmybaties.controller;

import com.qianfeng.springbootmybaties.entity.TUser;
import com.qianfeng.springbootmybaties.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("user")
public class UserController {

    public void test(){};
    @Autowired
    private IUserService userService;

    @GetMapping("getUserById/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model){
        TUser user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "index";
    }
    @GetMapping("pageIndex")
    public String pageIndex(){
        TUser user = new TUser();
        user.setUsername("zs");
        user.setPassword("123");
        user.setId(1l);
        return "user:"+user;
    }
}
