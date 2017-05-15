package com.mirsfang.model;

import javax.persistence.*;

/**
 * 智能硬件
 * Created by Administrator on 2017/5/15.
 */
@Entity
public class IntelligentHardware {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    //商品id
    private int commdity_id;

    private String  image;
    //标题
    private String title;
    //描述
    private String descri;
    //价格
    private double price;

    //外连接
    private String url;

    public IntelligentHardware() {
    }

    public IntelligentHardware(int commdity_id, String image, String title, String descri, double price, String url) {
        this.commdity_id = commdity_id;
        this.image = image;
        this.title = title;
        this.descri = descri;
        this.price = price;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommdity_id() {
        return commdity_id;
    }

    public void setCommdity_id(int commdity_id) {
        this.commdity_id = commdity_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
