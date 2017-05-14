package com.mirsfang.service;

import com.mirsfang.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/5/14.
 */
public interface BannerService extends JpaRepository<Banner,Integer> {

}
