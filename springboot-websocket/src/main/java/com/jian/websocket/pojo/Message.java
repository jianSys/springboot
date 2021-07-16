package com.jian.websocket.pojo;

/**
 * @ProjectName: springboot
 * @ClassName: Message
 * @Author: jian
 * @Description:
 * @Date: 2021/7/16 14:45
 * @Version: 1.0
 */
public class Message {

    private String name;

    public Message() {
    }

    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
