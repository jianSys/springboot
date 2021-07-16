package com.jian.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @ClassName: HelloController
 * @Author: jian
 * @Description:
 * @Date: 2021/4/8 11:31
 * @Version: 1.0
 */
@RestController
public class HelloController {
    //读取配置文件
    @Value("${name}")
    String name;
//    读取配置文件适用于大量配置
    @Autowired
    private Environment env;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(env.getProperty("name"));
        return "hello"+name;
    }
}
