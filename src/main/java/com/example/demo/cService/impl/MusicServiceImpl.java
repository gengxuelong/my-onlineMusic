package com.example.demo.cService.impl;

import com.example.demo.aEntity.Music;
import com.example.demo.bDao.Bang_Music_Dao;
import com.example.demo.bDao.MusicDao;
import com.example.demo.cService.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName MusicServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    MusicDao musicDao;
    @Autowired
    Bang_Music_Dao bang_music_dao;

    @Override
    public Music findMusicById(String id) {
        return musicDao.getMusicById(id);
    }

    @Override
    public List<Music> findMusicListByName(String name) {
        return musicDao.getMusicListByName(name);
    }

    @Override
    public List<Music> findMusicListByBangIdList(List<String> bangIdList) {
        List<String> musicIdListByBangIdList = bang_music_dao.getMusicIdListByBangIdList(bangIdList);
        return musicDao.getMusicListByIdList(musicIdListByBangIdList);
    }

    @Override
    public int updateAllMusicImage() {
        int isSuccess = 1;
        List<Music> allMusic = musicDao.getAllMusic();
        for (Music music : allMusic) {
            String url = "http://localhost:8888/onlineMuisc/image/" + music.getName() + ".jpg";
            String mid = music.getId();
            int temp = musicDao.updateMusicImage(url, mid);
            if (temp == 0) {
                isSuccess = 0;
            }
        }
        return isSuccess;
    }
}
