package com.mirsfang.controller;

import com.mirsfang.model.User;
import com.mirsfang.model.commdity.Commodity;
import com.mirsfang.service.CommdityService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/5/16.
 */
@Controller
@EnableAutoConfiguration
public class  CommidityController {

    @Autowired
    CommdityService commdityService;

    @RequestMapping("/detail")
    public String showCommdityDetails(HttpServletRequest httpServletRequest,ModelMap modelMap, Integer cid){
        Commodity commodity=commdityService.findById(cid);
        modelMap.addAttribute("commodity",commodity);

        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if(user!=null) {
            System.out.println("detail 拦截  "+ user.getNickname());
            modelMap.addAttribute("userid",user.getId());
        }

        return "detail";
    }

}
