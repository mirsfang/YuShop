package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/28.
 */

import com.mirsfang.model.Orders;
import com.mirsfang.model.commdity.CommdityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/28/下午7:56  
 *备注      
 ***/

public interface OrdersService extends JpaRepository<Orders,Integer> {

}

