package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/25.
 */

import com.mirsfang.model.Admin;
import com.mirsfang.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/***
 *时间：2017/05/25/上午8:41
 *备注  管理  包含:管理登录  管理详细的一些
 ***/

@Controller
@EnableAutoConfiguration
public class AdminController {

    @Autowired
    AdminService adminService;


    @RequestMapping(value = "/admin_login", method = RequestMethod.GET)
    public String gotoAdminLogin() {


        return "admin_login";
    }

    @RequestMapping(value = "/admin_login", method = RequestMethod.POST)
    public String postoAdminLogin(WebRequest webRequest, org.apache.catalina.servlet4preview.http.HttpServletRequest httpSession) {

        String username = webRequest.getParameter("username");
        String password = webRequest.getParameter("password");

        Admin admin = adminService.findUserByUsernameAndPassword(username, password);
        if (admin == null) {
            return "admin_login";
        } else {
            admin.setPassword("");
            httpSession.getSession().setAttribute("admin", admin);
            return "redirect:admin";
        }
    }


    @RequestMapping(value = "/admin")
    public String gotoAdmin(ModelMap modelMap, org.apache.catalina.servlet4preview.http.HttpServletRequest httpSession) {
        Admin admin = (Admin) httpSession.getSession().getAttribute("admin");
        if(admin == null){
            return "redirect:admin_login";
        }else {
            System.out.println("管理员 :"+admin.getNickname()+"已登录");
            return "admin";
        }
    }


    public static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {
        }
        return session;
    }

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
}
