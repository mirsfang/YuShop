package com.mirsfang.controller;

import com.mirsfang.model.Response;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/20.
 */
@RestController
@EnableAutoConfiguration
public class OderController {

    @RequestMapping("submite")
    public Response Submite(Integer c_id,Integer colorId,Integer versionId){
        System.out.print(c_id+"--"+colorId+"--"+versionId);
        Response response = new Response();
        response.setStatus(1);
        response.setMsg("下单成功");
        return response;
    }
}
