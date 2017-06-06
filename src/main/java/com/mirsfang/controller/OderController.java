package com.mirsfang.controller;

import com.google.gson.Gson;
import com.mirsfang.model.Orders;
import com.mirsfang.model.Response;
import com.mirsfang.model.User;
import com.mirsfang.model.commdity.Commodity;
import com.mirsfang.service.CommdityService;
import com.mirsfang.service.OrdersService;
import com.mirsfang.service.UserService;
import com.mirsfang.state.OrderState;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */
@RestController
@EnableAutoConfiguration
public class OderController {

    @Autowired
    OrdersService ordersService;

    @Autowired
    CommdityService commdityService;

    @Autowired
    UserService userService;

    @RequestMapping("submite")
    public Response Submite(HttpServletRequest httpServletRequest,Integer c_id, Integer colorId, Integer versionId, Integer userid) {
        Response response = new Response();
        Orders orders = new Orders();

        System.out.println("\n\n订单  用户:" + userid);

        try {
            Commodity commodity = commdityService.findById(colorId);
            User user = userService.findById(userid);


            if (commodity != null && user != null) {
                orders.setCreatetime(getStringDate());
                orders.setCommodityId(commodity.getId());
                orders.setOrderQuantity(1);
                orders.setPrice(commodity.getPrice());
                orders.setUser(user);
                orders.setCommtidName(commodity.getCommdname());
                orders.setState(OrderState.未付款);
                Orders saveOrder = ordersService.save(orders);
                if (saveOrder != null) {
                    response.setStatus(1);
                    System.out.println("下单成功");
                    response.setMsg("下单成功");
                    return response;
                }
            }
        } catch (Exception e) {

        }

        if (userid == 0) {
            response.setStatus(-1);
            System.out.println("尚未登录");
            response.setMsg("尚未登录");
        } else {
            response.setStatus(-1);
            System.out.println("下单失败");
            response.setMsg("下单失败");
        }

        return response;
    }

    /**
     * 获取现在时间
     *
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    @RequestMapping("/userOrder")
    @ResponseBody
    public Response getUserOrders(){
        Response response =new Response();

        List<Orders> ordersList = ordersService.findAll();

        if(ordersList!=null){
            response.setStatus(1);
            response.setData(ordersList);
        }else {
            response.setStatus(-1);
            response.setMsg("查询失败");
        }

        System.out.println("查询所有订单  "+ordersList.size());

        return response;
    }

    @RequestMapping("/updateOrder")
    @ResponseBody
    public Response updataOrder(String json){
        System.out.println(json );
        Response response = new Response();
        Orders orders= new Gson().fromJson(json,Orders.class);
        if(orders!=null){
            Orders save =  ordersService.save(orders);

            if(save!=null){
                response.setStatus(1);
            }
        }else {
            response.setStatus(-1);
        }
        return response;
    }

}
