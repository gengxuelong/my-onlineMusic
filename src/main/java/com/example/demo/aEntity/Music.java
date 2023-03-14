package com.example.demo.aEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/27
 * @ClassName Music
 * @verson 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    private String id;
    private String name;
    private String artist;
    private String img_url;
    private String audio_url;//audio: 音频
    private String songTimeMinutes;
}
