package com.jian.log.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: springboot
 * @ClassName: LogController
 * @Author: jian
 * @Description:
 * @Date: 2021/4/8 16:47
 * @Version: 1.0
 */


@RestController
public class LogController {

    /*private static Logger log = Logger.getLogger(LogController.class);*/

    @RequestMapping("/log")
    public String log(){
        //log.info("log4j测试=============================>>>>");
        return "log";
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

    }
}
