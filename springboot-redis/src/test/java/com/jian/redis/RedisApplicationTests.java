package com.jian.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("nihao","lijian");
    }
    @Test
    void get(){
        Object nihao = redisTemplate.opsForValue().get("nihao");
        System.out.println(nihao);
    }

}
