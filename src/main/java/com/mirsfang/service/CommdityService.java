package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/17.
 */

import com.mirsfang.model.commdity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/17/下午12:35  
 *备注  商品详情
 ***/

public interface CommdityService extends JpaRepository<Commodity,Integer>{

    //查找商品
    Commodity findById(int id);

}
