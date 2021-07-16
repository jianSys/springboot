package com.jian.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @ClassName: HelloController
 * @Author: jian
 * @Description:
 * @Date: 2021/4/8 10:31
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello StringBoot";
    }
}
