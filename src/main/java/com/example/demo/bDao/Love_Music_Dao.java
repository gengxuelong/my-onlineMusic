package com.example.demo.bDao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Love_Music_Dao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface Love_Music_Dao {
    List<String> getMusicIdListByUserId(String user_id);

    int insertLoveMusic(@Param("user_id") String user_id, @Param("music_id") String music_id);

    int removeLoveMusic(@Param("user_id") String user_id, @Param("music_id") String music_id);

    int findNumByUserIdAndMusicId(@Param("user_id") String user_id, @Param("music_id") String music_id);
}
