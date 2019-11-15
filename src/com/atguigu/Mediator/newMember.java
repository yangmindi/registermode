package com.atguigu.Mediator;

import java.sql.Time;

public class newMember extends Member{

    public newMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("新的具体会员发送消息:");
        long l = System.currentTimeMillis();
        String time = String.valueOf(l);
        chatroom.sendText(name,to,message+"---"+time);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("新的具体会员发送图片:");
        chatroom.sendImage(name,to,image);
    }
}
