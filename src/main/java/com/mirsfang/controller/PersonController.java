package com.mirsfang.controller;/**
 * Created by MirsFang on 2017/5/29.
 */

import com.mirsfang.model.Orders;
import com.mirsfang.model.Response;
import com.mirsfang.model.User;
import com.mirsfang.service.OrdersService;
import com.mirsfang.service.PersonOrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/29/下午6:38  
 *备注      
 ***/

@Controller
@EnableAutoConfiguration
public class PersonController {

    @Autowired
    PersonOrderService personOrderService;

    @RequestMapping("/person")
    public String gotoPerson(org.apache.catalina.servlet4preview.http.HttpServletRequest httpServletRequest,ModelMap modelMap){
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if(user==null){
            return "redirect:login";
        }
        List<Orders>  ordersList = personOrderService.findByUserId(user.getId());

        modelMap.addAttribute("orders",ordersList);
        System.out.println("用户 "+user.getNickname()+"  订单数:"+ordersList.size());
        return "person";
    }

    @RequestMapping("/tuihuo")
    @ResponseBody
    public Response tuiHuo(Integer orderId){
        Response response = new Response();
        Orders orders=personOrderService.findOne(orderId);
        orders.setState(4);
        Orders save = personOrderService.save(orders);

        if(save!=null){
            response.setStatus(1);
        }else {
            response.setStatus(-1);
        }
        System.out.println("退货操作成功!"+orderId);
        return response;
    }


}
