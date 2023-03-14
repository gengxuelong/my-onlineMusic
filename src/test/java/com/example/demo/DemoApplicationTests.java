package com.example.demo;

import com.example.demo.aEntity.*;
import com.example.demo.bDao.*;
import com.example.demo.eUtls.WriteFileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Bang_Music_Dao bang_music_dao;//两个函数均测试成功

    @Autowired
    BangDao bangDao;//两个函数均测试成功

    @Autowired
    BannerDao bannerDao;//通过

    @Autowired
    Love_Music_Dao love_music_dao;//通过

    @Autowired
    MusicDao musicDao;//通过

    @Autowired
    Recommend_Music_Dao recommend_music_dao;//通过

    @Autowired
    RecommendSongDao recommendSongDao;//通过

    @Autowired
    UserDao userDao;//通过

    @Autowired
    WriteFileUtils writeFileUtils;//通过

    @Test
    void contextLoads() {
        writeFileUtils.write("你好呀");
    }

}
