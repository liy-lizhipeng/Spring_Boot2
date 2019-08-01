package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author Liy
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {
   /* @Value("${fileServer.path}")
    private String fileServer;

    @Value("${emailServer.path}")
    private String emailServer;
*/
   @Autowired//注入
   private Resource resource;

    @GetMapping("properties")
    public String properties(){
        return resource.getImageServer()+":"+resource.getEmailServer();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello..";
    }

    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable("pageIndex") Integer pageIndex){
        return "pageIndex2:"+pageIndex;
    }

    @GetMapping("addUser")
    public User addUser(User user){
        user.setEntryDate(new Date());
        user.setUsername("liy");
        user.setPassword("123456");
        return user;
    }
}
