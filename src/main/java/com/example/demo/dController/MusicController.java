package com.example.demo.dController;

import com.example.demo.aEntity.Music;
import com.example.demo.cService.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName MusicController
 * @verson 1.0
 * @Description:
 */
@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicService service;


    @GetMapping("/findMusicById")
    public Music findMusicById(String mid) {
        return service.findMusicById(mid);
    }

    @GetMapping("/findMusicByName")
    public List<Music> findMusicByName(String name) {
        return service.findMusicListByName(name);
    }

    @GetMapping("/findMusicByBangIdList")
    public Object findMusicByBangIdList(List<String> BangIdList) {
        return service.findMusicListByBangIdList(BangIdList);
    }

    @GetMapping("/updateAllMusicImg")
    public Integer updateAllMusicImg() {
        return service.updateAllMusicImage();
    }

}
