package com.example.demo.bDao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Recommend_Music_Dao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface Recommend_Music_Dao {
    List<String> getMusicIdListByRecommendId(String recommend_id);
}
