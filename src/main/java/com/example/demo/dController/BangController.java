package com.example.demo.dController;

import com.example.demo.aEntity.Bang;
import com.example.demo.cService.BangService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName BangController
 * @verson 1.0
 * @Description:
 */
@RestController
@RequestMapping("/bang")
public class BangController {
    @Autowired
    BangService bangService;

    @GetMapping("/findAllBang")
    public List<Bang> findAllBang() {
        return bangService.findAllBang();
    }

}
