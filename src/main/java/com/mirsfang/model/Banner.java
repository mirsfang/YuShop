package com.mirsfang.model;

import javax.persistence.*;

/**
 * Banner图
 * Created by Administrator on 2017/5/14.
 */
@Entity
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    //图片 高清大图
    private String image;

    //商品的Id
    private int commodity_id;

    public Banner() {
    }

    public Banner(String image, int commodity_id) {
        this.image = image;
        this.commodity_id = commodity_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        this.commodity_id = commodity_id;
    }
}
