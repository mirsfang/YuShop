package com.mirsfang.model.commdity;/**
 * Created by MirsFang on 2017/5/11.
 */

import javax.persistence.*;
import java.io.Serializable;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/11/下午12:21  
 *备注  产品版本
 ***/
@Entity
public class CommdityVersion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    //描述
    private String verionDescribe;

    @ManyToOne(optional = false)
    private Commodity commodity;

    public CommdityVersion() {
    }

    public CommdityVersion(String verionDescribe, Commodity commodity) {
        this.verionDescribe = verionDescribe;
        this.commodity = commodity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVerionDescribe() {
        return verionDescribe;
    }

    public void setVerionDescribe(String verionDescribe) {
        this.verionDescribe = verionDescribe;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
}
