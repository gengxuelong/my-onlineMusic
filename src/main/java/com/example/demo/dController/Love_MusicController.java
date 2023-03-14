package com.example.demo.dController;

import com.example.demo.aEntity.Music;
import com.example.demo.cService.Love_Music_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName Love_MusicController
 * @verson 1.0
 * @Description:
 */
@RestController
@RequestMapping("/Love_Music")
public class Love_MusicController {
    @Autowired
    Love_Music_Service service;

    @GetMapping("/insertLoveMusic/{mid}/{uid}")
    public int insertLoveMusic(@PathVariable("mid") String mid, @PathVariable("uid") String uid) {
        return service.insertLoveMusic(mid, uid);
    }

    @GetMapping("/removeLoveMusic/{mid}/{uid}")
    public int removeLoveMusic(@PathVariable("mid") String mid, @PathVariable("uid") String uid) {
        return service.removeLoveMusic(mid, uid);
    }

    @GetMapping("/findLoveMusicByUid/{id}")
    public List<Music> findLoveMusicByUid(@PathVariable("id") String uid) {
        return service.findMusicListByUserId(uid);
    }

    @GetMapping("/findNumByUidAndMid/{mid}/{uid}")
    public Integer findNumByUidAndMid(@PathVariable("mid") String mid, @PathVariable("uid") String uid) {
        return service.findNumByUserIdAndMusicId(mid, uid);
    }

}
