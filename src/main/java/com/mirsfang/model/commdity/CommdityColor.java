package com.mirsfang.model.commdity;/**
 * Created by MirsFang on 2017/5/11.
 */

import javax.persistence.*;
import java.io.Serializable;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午12:21  
 *备注  产品颜色
 ***/
@Entity
public class CommdityColor implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    //颜色
    private String color;

    //描述
    private String colorDescribe;

    @ManyToOne(optional = false)
    private Commodity commodity;


    public CommdityColor() {
    }

    public CommdityColor(String color, String colorDescribe, Commodity commodity) {
        this.color = color;
        this.colorDescribe = colorDescribe;
        this.commodity = commodity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorDescribe() {
        return colorDescribe;
    }

    public void setColorDescribe(String colorDescribe) {
        this.colorDescribe = colorDescribe;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
}
