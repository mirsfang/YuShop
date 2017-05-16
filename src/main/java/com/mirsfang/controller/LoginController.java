package com.mirsfang.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/16.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping("/login")
    public String showCommdityDetails(ModelMap modelMap){

        return "login";
    }
}
