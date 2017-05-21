package com.mirsfang.service;

import com.mirsfang.model.StartCommdity;
import com.mirsfang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * 明星产品
 */
public interface StarCommdityService extends Repository<StartCommdity,Integer> {

    @Query(value = "select * from start_commdity a where a.id < ?1",nativeQuery = true)
    List<StartCommdity> findByFirstId(int size);
}
