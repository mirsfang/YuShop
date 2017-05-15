package com.mirsfang.service;

import com.mirsfang.model.IntelligentHardware;
import com.mirsfang.model.StartCommdity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * 智能硬件模块
 * Created by Administrator on 2017/5/15.
 */
public interface IntelligenHardwareService  extends Repository<IntelligentHardware,Integer> {

    //查询前x个智能硬件推荐
    @Query(value = "select * from intelligent_hardware a where a.id < ?1",nativeQuery = true)
    List<IntelligentHardware> findByFirstId(int size);
}
