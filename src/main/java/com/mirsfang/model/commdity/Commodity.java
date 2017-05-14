package com.mirsfang.model.commdity;/**
 * Created by MirsFang on 2017/5/11.
 */

import com.mirsfang.model.Orders;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午12:15  
 *备注  商品信息
 ***/

@Entity
public class Commodity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    //商品名称
    private String commdname;
    //商品库存
    private int  stock;
    //版本
    private int  version;
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
    //包含版本
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "commodity")
    private Set<CommdityVersion> versions;

    //包含颜色
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "commodity")
    private Set<CommdityColor> colors;

    @ManyToOne(optional = false)
    private Orders order;


    public Commodity() {
    }

    public Commodity(String commdname, int stock, int version, String describition, String image, String releasetime, double price, double value, Set<CommdityVersion> versions, Set<CommdityColor> colors, Orders order) {
        this.commdname = commdname;
        this.stock = stock;
        this.version = version;
        this.describition = describition;
        this.image = image;
        this.releasetime = releasetime;
        this.price = price;
        this.value = value;
        this.versions = versions;
        this.colors = colors;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public Set<CommdityVersion> getVersions() {
        return versions;
    }

    public void setVersions(Set<CommdityVersion> versions) {
        this.versions = versions;
    }

    public Set<CommdityColor> getColors() {
        return colors;
    }

    public void setColors(Set<CommdityColor> colors) {
        this.colors = colors;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
