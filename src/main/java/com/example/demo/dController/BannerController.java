package com.example.demo.dController;

import com.example.demo.aEntity.Banner;
import com.example.demo.cService.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName BannerController
 * @verson 1.0
 * @Description:
 */
@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    BannerService bannerService;

    @GetMapping("/findAllBanner")
    public List<Banner> findAllBanner() {
        return bannerService.findAllBanner();
    }
}
