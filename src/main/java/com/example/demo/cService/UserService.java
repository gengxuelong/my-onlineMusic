package com.example.demo.cService;

import com.example.demo.aEntity.User;
import org.springframework.web.multipart.MultipartFile;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName UserService
 * @verson 1.0
 * @Description:
 */
public interface UserService {
    Object login(User user);

    int updateUser(User user);

    Object upLoadFile(MultipartFile file, String uid, String fileName);

    String register(User user);
}
