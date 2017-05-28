package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/26.
 */

import com.mirsfang.model.Admin;
import com.mirsfang.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/26/下午1:26  
 *备注      
 ***/

public interface AdminService  extends JpaRepository<Admin,Integer> {

    Admin findUserByUsernameAndPassword(String username,String password);

}
