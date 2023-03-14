package com.example.demo.cService.impl;

import com.example.demo.aEntity.RecommendSong;
import com.example.demo.bDao.RecommendSongDao;
import com.example.demo.cService.RecommendSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName RecommendSongServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class RecommendSongServiceImpl implements RecommendSongService {
    @Autowired
    RecommendSongDao recommendSongDao;

    @Override
    public List<RecommendSong> findAllRecommendSong() {
        return recommendSongDao.getAllRecommendSong();
    }
}
