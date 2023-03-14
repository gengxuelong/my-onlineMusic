package com.example.demo.dController;


import com.example.demo.aEntity.Music;
import com.example.demo.cService.Recommend_Music_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Recommend_Music")
public class Recommend_MusicController {
    @Autowired
    private Recommend_Music_Service service;

    @GetMapping("/findMusicByrid")
    public List<Music> findMusicByrid(String rid) {
        return service.findMusicListByRecommendId(rid);
    }


}
