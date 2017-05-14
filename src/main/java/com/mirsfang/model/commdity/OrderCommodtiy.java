package com.mirsfang.model.commdity;

import com.mirsfang.model.Orders;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/14.
 * 订单商品表
 */
@Entity
public class OrderCommodtiy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    //在商品表中的id
    private int commdId;
    //商品名称
    private String commdname;
    //商品库存
    private int stock;
    //描述
    private String describition;
    //图片
    private String image;
    //发布时间
    private String releasetime;
    //价格
    private double price;
    //价值
    private double value;
    //颜色
    private String color;
    //类型
    private String versions;
    //商品的类型
    private String commditytype;
    //多个订单商品对应一个订单
    @ManyToOne(optional = false)
    private Orders order;

    public OrderCommodtiy() {
    }

    public OrderCommodtiy(int commdId, String commdname, int stock, String describition, String image, String releasetime, double price, double value, String color, String versions, String commditytype, Orders order) {
        this.commdId = commdId;
        this.commdname = commdname;
        this.stock = stock;
        this.describition = describition;
        this.image = image;
        this.releasetime = releasetime;
        this.price = price;
        this.value = value;
        this.color = color;
        this.versions = versions;
        this.commditytype = commditytype;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommdId() {
        return commdId;
    }

    public void setCommdId(int commdId) {
        this.commdId = commdId;
    }

    public String getCommdname() {
        return commdname;
    }

    public void setCommdname(String commdname) {
        this.commdname = commdname;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescribition() {
        return describition;
    }

    public void setDescribition(String describition) {
        this.describition = describition;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getCommditytype() {
        return commditytype;
    }

    public void setCommditytype(String commditytype) {
        this.commditytype = commditytype;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
