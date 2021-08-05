package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @program: SpringBoot
 * @description:
 * @author: jian
 * @create: 2021-05-22 16:40
 **/

@Controller
public class FreeMarkerController {

    @GetMapping("/admin/index")
    private String index(Map map){
        //model.addAttribute("hello","我是你爸爸");
        map.put("hello","我是你爸爸");
        return "/admin/index";
    }
}
