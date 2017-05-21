package com.mirsfang.controller;

import com.mirsfang.model.commdity.Commodity;
import com.mirsfang.service.CommdityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/5/16.
 */
@Controller
@EnableAutoConfiguration
public class  CommidityController {

    @Autowired
    CommdityService commdityService;

    @RequestMapping("/detail")
    public String showCommdityDetails(ModelMap modelMap,Integer cid){

        Commodity commodity=commdityService.findById(cid);
        modelMap.addAttribute("commodity",commodity);
        return "detail";
    }

}
