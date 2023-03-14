package com.example.demo.cService.impl;

import com.example.demo.aEntity.User;
import com.example.demo.bDao.UserDao;
import com.example.demo.cService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName UserServiceImpl
 * @verson 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Object login(User user) {
        Map<String, Object> res = new HashMap<>();
        User user1 = userDao.getUserById(user.getId());
        if (user1 == null) {
            res.put("msg", "用户id不存在");
            res.put("code", "400");
        } else {
            if (user1.getPassword().equals(user.getPassword())) {
                res.put("msg", "登录成功");
                res.put("code", "200");
                res.put("user", user1);
            } else {
                res.put("msg", "密码错误");
                res.put("code", "400");
            }
        }
        return res;
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Object upLoadFile(MultipartFile file, String uid, String fileName) {
        Map<String, Object> res = new HashMap<>();
        if (file.isEmpty()) {
            res.put("msg", "文件为空");
            res.put("code", "400");
        }
        String file_url = "D://onlineMusic/avatar_url/" + fileName;
        File file1 = new File(file_url);
        if (!file1.getParentFile().exists()) {
            file1.getParentFile().mkdir();
        }
        try {
            file.transferTo(file1);
            String avatar_url = "http://localhost:8888/onlineMusic/avatar_url/" + fileName;
            User user = new User(uid, null, -1, avatar_url, null);
            int result = userDao.updateUser(user);
            res.put("code", "200");
            res.put("msg", result > 0 ? "上传成功" : "上传失败");
        } catch (IOException e) {
            e.printStackTrace();
            res.put("code", "400");
            res.put("msg", e.getMessage());
        }
        return res;
    }

    @Override
    public String register(User user) {
        String id = (int) (Math.random() * 100000000 + 600000000) + "";
        String default_avatar_url = "http://localhost:8888/onlineMusic/avatar/666.png";
        user.setAvatar_url(default_avatar_url);
        user.setId(id);
        if (userDao.register(user) > 0) {
            return id;
        } else {
            return "-1";
        }
    }
}
