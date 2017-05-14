package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/11.
 */

import com.mirsfang.model.Banner;
import com.mirsfang.model.commdity.CommdityType;
import com.mirsfang.service.BannerService;
import com.mirsfang.service.IndexPush;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    private IndexPush indexPush;

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap){
        //得到类型
        List<CommdityType> types=indexPush.findByFirstAccountId(11);
        modelMap.addAttribute("push",types);

        //Banner
        List<Banner> banners=bannerService.findAll();
        modelMap.addAttribute("banner",banners);
        return "index";
    }


}
