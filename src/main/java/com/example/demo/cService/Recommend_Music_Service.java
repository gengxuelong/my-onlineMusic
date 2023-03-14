package com.example.demo.cService;

import com.example.demo.aEntity.Music;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Recommend_Music_Service
 * @verson 1.0
 * @Description:
 */
public interface Recommend_Music_Service {
    List<Music> findMusicListByRecommendId(String rid);
}
