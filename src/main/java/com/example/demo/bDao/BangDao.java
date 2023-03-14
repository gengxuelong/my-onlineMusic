package com.example.demo.bDao;

import com.example.demo.aEntity.Bang;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName BangDao
 * @verson 1.0
 * @Description:
 */
@Repository
public interface BangDao {
    Bang getBangById(String id);

    List<Bang> getAllBang();
}
