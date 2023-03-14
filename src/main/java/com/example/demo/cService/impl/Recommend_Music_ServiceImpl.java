package com.example.demo.cService.impl;

import com.example.demo.aEntity.Music;
import com.example.demo.bDao.MusicDao;
import com.example.demo.bDao.Recommend_Music_Dao;
import com.example.demo.cService.Recommend_Music_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Recommend_Music_ServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class Recommend_Music_ServiceImpl implements Recommend_Music_Service {

    @Autowired
    Recommend_Music_Dao recommend_music_dao;
    @Autowired
    MusicDao musicDao;

    @Override
    public List<Music> findMusicListByRecommendId(String rid) {
        List<String> musicIdList = recommend_music_dao.getMusicIdListByRecommendId(rid);
        return musicDao.getMusicListByIdList(musicIdList);
    }
}
