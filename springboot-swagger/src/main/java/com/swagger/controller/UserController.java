package com.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @ClassName: UserController
 * @Author: jian
 * @Description: 用户测试
 * @Date: 2021/8/5 14:36
 * @Version: 1.0
 */
@RestController
@Api(tags = {"用户测试"})
@RequestMapping("user")
public class UserController {
    @GetMapping("name")
    @ApiOperation(value = "查询用户")
    private String findUserByName(){
        return "你好世界";
    }
}
