package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/11.
 */

import com.mirsfang.model.Banner;
import com.mirsfang.model.Response;
import com.mirsfang.model.StartCommdity;
import com.mirsfang.model.User;
import com.mirsfang.model.commdity.CommdityType;
import com.mirsfang.service.BannerService;
import com.mirsfang.service.IndexPush;
import com.mirsfang.service.StarCommdityService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/***：
 *时间：2017/05/11/上午10:52  
 *备注      
 ***/
@Controller
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private IndexPush indexPush;    //首页推送数据

    @Autowired
    private BannerService bannerService;    //Banner广告图数据

    @Autowired
    private StarCommdityService starCommdityService;    //明星产品数据

    @RequestMapping(value = "/")
    public String index(HttpServletRequest httpServletRequest,ModelMap modelMap, HttpSession httpSession){
        //得到类型
        List<CommdityType> types=indexPush.findByFirstAccountId(11);
        modelMap.addAttribute("push",types);

        //Banner
        List<Banner> banners=bannerService.findAll();
        modelMap.addAttribute("banner",banners);

        //明星单品
        List<StartCommdity> startCommdities = starCommdityService.findByFirstId(10);
        modelMap.addAttribute("star",startCommdities);

        return "index";
    }



    /**
    *
    *作者:Mirsfang
    *日期:2017/6/1/上午8:54
    *描述:获取session中的值
    **/
    @RequestMapping(value = "/getUserFSession")
    @ResponseBody
    public Response getUserForSession(HttpServletRequest httpServletRequest) {
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if(user!=null){
            Response response = new Response();
            response.setStatus(1);
            response.setData(user);
            return response;
        }else {
            Response response = new Response();
            response.setStatus(-1);
            response.setMsg("未登录");
            return response;
        }


    }
}
