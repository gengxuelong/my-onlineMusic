package com.example.demo.cService.impl;

import com.example.demo.aEntity.Music;
import com.example.demo.bDao.Love_Music_Dao;
import com.example.demo.bDao.MusicDao;
import com.example.demo.bDao.UserDao;
import com.example.demo.cService.Love_Music_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Love_Music_ServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class Love_Music_ServiceImpl implements Love_Music_Service {

    @Autowired
    Love_Music_Dao love_music_dao;
    @Autowired
    MusicDao musicDao;

    @Override
    public int insertLoveMusic(String mid, String uid) {
        return love_music_dao.insertLoveMusic(uid, mid);
    }

    @Override
    public int removeLoveMusic(String mid, String uid) {
        return love_music_dao.removeLoveMusic(uid, mid);
    }

    @Override
    public List<Music> findMusicListByUserId(String uid) {
        List<String> musicIdList = love_music_dao.getMusicIdListByUserId(uid);
        if (musicIdList.size() == 0) return null;
        return musicDao.getMusicListByIdList(musicIdList);
    }

    @Override
    public int findNumByUserIdAndMusicId(String mid, String uid) {
        return love_music_dao.findNumByUserIdAndMusicId(uid, mid);
    }
}
