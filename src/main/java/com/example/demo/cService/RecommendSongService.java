package com.example.demo.cService;

import com.example.demo.aEntity.RecommendSong;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName RecommendSongService
 * @verson 1.0
 * @Description:
 */
public interface RecommendSongService {
    List<RecommendSong> findAllRecommendSong();
}
