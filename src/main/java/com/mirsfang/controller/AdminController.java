package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/25.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/25/上午8:41  
 *备注      
 ***/

@Controller
@EnableAutoConfiguration
public class AdminController {

    @RequestMapping("/admin_login")
    public String gotoAdminLogin(){
        return "admin_login";
    }
}
