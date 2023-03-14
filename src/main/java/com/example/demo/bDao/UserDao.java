package com.example.demo.bDao;

import com.example.demo.aEntity.User;
import org.springframework.stereotype.Repository;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName UserDao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface UserDao {
    User getUserById(String id);

    int updateUser(User user);

    int register(User user);
}
