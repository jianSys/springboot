package com.jian.websocket.controller;

import com.jian.websocket.pojo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: springboot
 * @ClassName: SocketController
 * @Author: jian
 * @Description: 聊天
 * @Date: 2021/7/16 14:21
 * @Version: 1.0
 */
@Controller
public class SocketController {
    @RequestMapping("/websocket/{name}")
    public String webSocket(@PathVariable String name, Model model) {
        try {
            //log.info("跳转到websocket的页面上");
            model.addAttribute("username", name);
            return "websocket";
        } catch (Exception e) {
            //log.info("跳转到websocket的页面上发生异常，异常信息是：" + e.getMessage());
            return "error";
        }
    }

}
