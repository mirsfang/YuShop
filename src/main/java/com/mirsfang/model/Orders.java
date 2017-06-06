package com.mirsfang.model;/**
 * Created by MirsFang on 2017/5/11.
 */


import com.mirsfang.model.commdity.Commodity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午1:06  
 *备注  订单
 ***/

@Entity
public class Orders implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    //编号  时间戳
    private String ordernumber;
    //一个订单对应多个订单商品
    private int commodityId;
    //购买数量
    private int orderQuantity;
    //订单金额
    private double price;
    //购买用户
    @ManyToOne(optional = false)
    private User user;

    //订单状态 -1:关闭
    //        0:未付款
    //        1:已付款
    //        2:运输中
    //        3:收货成功
    //        4:申请退货
    //        5:拒绝退货
    //        6:同意退货
    //        7:退货中
    //        8:退货成功
    private int state;
    //创建时间
    private String createtime;

    //商品名称
    private String commtidName;

    //状态描述
    @Transient
    private String stateDesc;

    public Orders() {
    }

    public Orders(String ordernumber, int commodityId, int orderQuantity, double price, User user, int state, String createtime,String commtidName) {
        this.ordernumber = ordernumber;
        this.commodityId = commodityId;
        this.orderQuantity = orderQuantity;
        this.price = price;
        this.user = user;
        this.state = state;
        this.createtime = createtime;
        this.commtidName = commtidName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCommtidName() {
        return commtidName;
    }

    public void setCommtidName(String commtidName) {
        this.commtidName = commtidName;
    }

    public String getStateDesc() {
        switch (getState()) {
            case -1:
                return "关闭";
            case 0:
                return "未付款";
            case 1:
                return "已付款";
            case 2:
                return "运输中";
            case 3:
                return "收货成功";
            case 4:
                return "申请退货";
            case 5:
                return "拒绝退货";
            case 6:
                return "同意退货";
            case 7:
                return "退货中";
            case 8:
                return "退货成功";
            default:
                return "正常";
        }

    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

}

