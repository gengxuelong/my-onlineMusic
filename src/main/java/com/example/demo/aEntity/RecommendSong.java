package com.example.demo.aEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/27
 * @ClassName RecommendSong
 * @verson 1.0
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecommendSong {
    private String id;
    private String name;
    private String author;
    private String info;
    private Integer listencnt;
    private String img_url;
}
