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

    //商品
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
    private Set<Commodity> commodities;

    //购买数量
    private int orderQuantity;

    //订单金额
    private double price;

    //购买用户
    @ManyToOne(optional = false)
    private User user;

    //订单状态 -1:关闭
    //        0:未付款 1:已付款 2:运输中 3:收货成功
    //        3:申请退货 4: 拒绝退货 5:同意退货 6:退货中 7:退货成功
    private int state;

    //创建时间
    private String createtime;

    public Orders() {
    }

    public Orders(String ordernumber, Set<Commodity> commodities, int orderQuantity, double price, User user, int state, String createtime) {
        this.ordernumber = ordernumber;
        this.commodities = commodities;
        this.orderQuantity = orderQuantity;
        this.price = price;
        this.user = user;
        this.state = state;
        this.createtime = createtime;
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

    public Set<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(Set<Commodity> commodities) {
        this.commodities = commodities;
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
}
