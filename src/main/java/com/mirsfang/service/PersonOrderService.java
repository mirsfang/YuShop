package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/30.
 */

import com.mirsfang.model.Orders;
import com.mirsfang.model.commdity.CommdityType;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/30/下午4:00  
 *备注      
 ***/

public interface PersonOrderService extends JpaRepository<Orders,Integer> {

    @Query(value = "select * from orders a where a.user_id=?1",nativeQuery = true)
    List<Orders> findByUserId(int user_id);


}
