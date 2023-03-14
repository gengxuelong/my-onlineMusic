package com.example.demo.eUtls;

import redis.clients.jedis.Jedis;

/**
 * @auther GengXuelong
 * @mail 3349495429@qq.com
 * @Date 2022/9/28
 * @ClassName RedisUtils
 * @verson 1.0
 * @Description:
 */
public class RedisUtils {
    public Jedis getJedis() {
        return new Jedis("localhost", 6379);
    }
}
