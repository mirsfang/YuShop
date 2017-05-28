package com.mirsfang.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/5/16.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showCommdityDetails(ModelMap modelMap){
        System.out.println("get 请求");
        return "login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String gotoPerson(WebRequest webRequest, HttpSession httpSession){
        String username = webRequest.getParameter("username");
        String password = webRequest.getParameter("password");
        System.out.println(username+" -----  "+password);
        return "person";

    }
}
