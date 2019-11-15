package com.atguigu.Mediator;

import java.util.Hashtable;

public class newChatGroup extends AbstractChatroom {
    private Hashtable members = new Hashtable();

    @Override
    public void register(Member member) {
        if(!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member) members.get(from);
        String newMessage = message;
        if(newMessage.length() >= 100){
            System.out.println("文本不能超过100个字");
        }else {
            //模拟不雅字符
            newMessage = message.replaceAll("日","*");
            newMessage = message.replaceAll("TMD","*");
            newMessage = message.replaceAll("操","*");
            member.receiveText(from,newMessage);
        }
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        //模拟图片大小判断
        if(image.length() > 20){
            System.out.println("图片太大，发送失败");
        }else {
            member.receiveImage(from,image);
        }
    }
}
