package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/23.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *时间：2017/05/23/下午8:23  
 *备注      
 ***/

@Controller
@EnableAutoConfiguration
public class RegisterController  {


    @RequestMapping("/reg")
    public String gotoRegister(){
        return "reg";
    }


    @RequestMapping("/details")
    public String gotoOverDetails(){
        System.out.println("请求  java");
        return "over_details";
    }
}
