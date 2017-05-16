package com.mirsfang.model;/**
 * Created by MirsFang on 2017/5/16.
 */

import javax.persistence.*;
import java.io.Serializable;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/16/下午5:32  
 *备注 搭配
 ***/

@Entity
public class Collocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    //类型 {“1”:热门,“2”“手机”,“3”,“电视”,“4”,“杂货铺”}
    private String type;

    //商品的ID
    private int commdity_id;

    //商品的图片
    private String image;

    //标题
    private String title;

    //价格
    private double price;

    //评价数量
    private String  evaluateCount;

    //评价内容
    private String evaluateContent;

    //评价人
    private String eaName;


    public Collocation() {
    }

    public Collocation(String type, int commdity_id, String image, String title, double price, String evaluateCount, String evaluateContent, String eaName) {
        this.type = type;
        this.commdity_id = commdity_id;
        this.image = image;
        this.title = title;
        this.price = price;
        this.evaluateCount = evaluateCount;
        this.evaluateContent = evaluateContent;
        this.eaName = eaName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEvaluateCount() {
        return evaluateCount;
    }

    public void setEvaluateCount(String evaluateCount) {
        this.evaluateCount = evaluateCount;
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public String getEaName() {
        return eaName;
    }

    public void setEaName(String eaName) {
        this.eaName = eaName;
    }
}
