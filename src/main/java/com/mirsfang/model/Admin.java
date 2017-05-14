package com.mirsfang.model;/**
 * Created by MirsFang on 2017/5/11.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午12:08  
 *备注  管理员表
 ***/
@Entity
public class Admin implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String username;


    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;



    private String email;   //邮箱
    private String phone;   //电话
    private String headimg; //头像
    private String regtime; //注册时间


    public Admin() {
    }

    public Admin(String username, String nickname, String password, String email, String phone, String headimg, String regtime) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.headimg = headimg;
        this.regtime = regtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }
}
