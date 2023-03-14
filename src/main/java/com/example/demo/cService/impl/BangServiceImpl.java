package com.example.demo.cService.impl;

import com.example.demo.aEntity.Bang;
import com.example.demo.bDao.BangDao;
import com.example.demo.cService.BangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName BangService
 * @verson 1.0
 * @Description:
 */
@Service
public class BangServiceImpl implements BangService {
    @Autowired
    BangDao bangDao;

    @Override
    public List<Bang> findAllBang() {
        return bangDao.getAllBang();
    }
}
