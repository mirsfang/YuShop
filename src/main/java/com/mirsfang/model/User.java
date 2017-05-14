package com.mirsfang.model;/**
 * Created by MirsFang on 2017/5/11.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/上午11:06  
 *备注  用户表
 ***/

@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String nickname;//昵称
    @Column(nullable = false)
    private String username;//用户名
    @Column(nullable = false)
    private String password;//密码
    @Column(nullable = false)
    private String paypassword;//支付密码
    private String headimg;//头像
    private String email;//邮箱
    private String phone;//手机号
    private double balance;//余额
    private String regtime;//注册时间


    @OneToMany (fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Orders> orders;

    public User() {
    }

    public User(String nickname, String username, String password, String paypassword, String headimg, String email, String phone, double balance, String regtime, Set<Orders> orders) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.paypassword = paypassword;
        this.headimg = headimg;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.regtime = regtime;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
