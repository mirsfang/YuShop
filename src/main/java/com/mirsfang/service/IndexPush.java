package com.mirsfang.service;

import com.mirsfang.model.commdity.CommdityType;
import com.mirsfang.model.commdity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 * 首页banner旁推荐
 */
public interface IndexPush extends Repository<CommdityType,Integer> {


    @Query(value = "select * from commdity_type a where a.id < ?1",nativeQuery = true)
    List<CommdityType>  findByFirstAccountId(int accountId);


}
