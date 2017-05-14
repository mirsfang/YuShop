package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/11.
 */

import com.mirsfang.model.User;
import com.mirsfang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/上午10:52  
 *备注      
 ***/
@Controller
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUser(){
        User user=new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setNickname("admin");
        user.setBalance(1000);
        user.setEmail("mirsfang@163.com");
        user.setPhone("18757178184");
        user.setRegtime(new Date().getTime()+"");
        user.setPaypassword("123456");
        userService.save(user);
        return "success";
    }
}
