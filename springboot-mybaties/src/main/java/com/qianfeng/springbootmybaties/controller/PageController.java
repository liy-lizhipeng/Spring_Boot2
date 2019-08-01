package com.qianfeng.springbootmybaties.controller;

import com.qianfeng.springbootmybaties.entity.TUser;
import com.qianfeng.springbootmybaties.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Liy
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    private IUserService userService;

    @RequestMapping("getPage")
   public String getPage(Model model){
       /* TUser user = new TUser();
        user.setUsername("蚂蚁");
        user.setPassword("123456");
        user.setAge(100);
        model.addAttribute("user",user);*/
        List<TUser> users = userService.getUserList();
        model.addAttribute("users",users);
        return "index";
   }
}
