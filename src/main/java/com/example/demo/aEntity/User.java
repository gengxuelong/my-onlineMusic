package com.example.demo.aEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/27
 * @ClassName User
 * @verson 1.0
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String id;
    private String name;
    private int sex;
    private String avatar_url;
    private String password;
}
