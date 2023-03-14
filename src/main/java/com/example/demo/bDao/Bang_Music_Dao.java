package com.example.demo.bDao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Bang_Music_Dao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface Bang_Music_Dao {
    List<String> getMusicIdListByBangId(String bang_id);

    List<String> getMusicIdListByBangIdList(List<String> bangIdList);
}
