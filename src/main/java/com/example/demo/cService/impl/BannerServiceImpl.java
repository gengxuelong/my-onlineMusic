package com.example.demo.cService.impl;

import com.example.demo.aEntity.Banner;
import com.example.demo.bDao.BannerDao;
import com.example.demo.cService.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName BannerServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerDao bannerDao;

    @Override
    public List<Banner> findAllBanner() {
        return bannerDao.getAllBanner();
    }
}
