package com.example.demo.aEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/27
 * @ClassName Recommend_Music
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommend_Music {
    private String id;
    private String music_id;
    private String recommend_id;
}
