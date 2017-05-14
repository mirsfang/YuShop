package com.mirsfang.model.commdity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/14.
 * 商品类型
 */
@Entity
public class CommdityType implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String typename;//类型名称

    //该类型下的商品
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "commditytype")
    private Set<Commodity> commodities;

    public CommdityType() {
    }

    public CommdityType(String typename, Set<Commodity> commodities) {
        this.typename = typename;
        this.commodities = commodities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Set<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(Set<Commodity> commodities) {
        this.commodities = commodities;
    }
}
