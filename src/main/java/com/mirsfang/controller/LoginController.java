package com.mirsfang.controller;

import com.mirsfang.model.User;
import com.mirsfang.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showCommdityDetails(ModelMap modelMap){
        System.out.println("get 请求");
        return "login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String gotoPerson(HttpServletRequest httpServletRequest,ModelMap modelMap, WebRequest webRequest){
        String username = webRequest.getParameter("username");
        String password = webRequest.getParameter("password");
        System.out.println(username+" -----  "+password);
        User user = userService.findByUsernameAndPassword(username,password);

        if(user!=null){
            httpServletRequest.getSession().setAttribute("user",user);
            return "redirect:person";
        }else {
            modelMap.addAttribute("login_msg","登录失败,请验证用户名和密码!");
            return "login";
        }
    }
}
