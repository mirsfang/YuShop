package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/16.
 */

import com.mirsfang.model.Collocation;
import com.mirsfang.model.commdity.CommdityType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/16/下午5:51  
 *备注  查找搭配
 ***/

public interface CollocationService extends Repository<Collocation,Integer> {

    /**
    *
    *作者:Mirsfang
    *日期:2017/5/16/下午5:53
    *描述:type  类型  类型 {“1”:热门,“2”“手机”,“3”,“电视”,“4”,“杂货铺”}
    **/
    @Query(value = "select * from collocation a where a.id < ?1 and  a.type = ?2",nativeQuery = true)
    List<CommdityType> findByFirstCollocation(int accountId,int type);


}