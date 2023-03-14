package com.example.demo.cService;

import com.example.demo.aEntity.Music;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName MusicService
 * @verson 1.0
 * @Description:
 */
public interface MusicService {
    Music findMusicById(String id);

    List<Music> findMusicListByName(String name);

    List<Music> findMusicListByBangIdList(List<String> bangIdList);

    int updateAllMusicImage();
}
