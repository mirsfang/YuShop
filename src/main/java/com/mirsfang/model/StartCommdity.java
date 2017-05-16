package com.mirsfang.model;
/**
 * Created by MirsFang on 2017/5/15.
 */

import javax.persistence.*;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/05/15/下午12:54  
 *备注  明星单品
 ***/
@Entity
public class StartCommdity {
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
}
