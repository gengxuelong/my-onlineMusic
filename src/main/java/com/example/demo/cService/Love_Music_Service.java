package com.example.demo.cService;

import com.example.demo.aEntity.Music;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Love_Music_Service
 * @verson 1.0
 * @Description:
 */
public interface Love_Music_Service {
    int insertLoveMusic(String mid, String uid);

    int removeLoveMusic(String mid, String uid);

    List<Music> findMusicListByUserId(String uid);

    int findNumByUserIdAndMusicId(String mid, String uid);
}
