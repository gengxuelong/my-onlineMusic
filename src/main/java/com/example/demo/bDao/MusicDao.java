package com.example.demo.bDao;

import com.example.demo.aEntity.Music;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName MusicDao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface MusicDao {
    Music getMusicById(String id);

    List<Music> getMusicListByName(String name);

    Music getMusicByNameAndArtist(@Param("name") String name, @Param("artist") String artist);

    List<Music> getMusicListByIdList(List<String> idList);

    int updateMusicImage(@Param("img_url") String image_url, @Param("id") String id);

    List<Music> getAllMusic();

    int insertMusic(Music music);
}
