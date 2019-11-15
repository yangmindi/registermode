package com.atguigu.memorandum;

import java.util.ArrayList;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();
        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("13000000000");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("---------------");

        user.setPassword("11111");
        user.setTelNo("131000001111");
        System.out.println("状态二：");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("---------------");


        user.restoreMemento(c.getMemento(0));
        System.out.println("回到状态一:");
        user.show();
        System.out.println("---------------");
    }
}
