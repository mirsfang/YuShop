package com.mirsfang.service;/**
 * Created by MirsFang on 2017/5/11.
 */

import com.mirsfang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午1:30  
 *备注  用户服务类
 ***/

public interface UserService extends JpaRepository<User,Integer> {

    User findById(int id);

}
