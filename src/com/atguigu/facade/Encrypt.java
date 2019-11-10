package com.atguigu.facade;

import com.atguigu.decorator.Song;

import java.sql.SQLOutput;

public class Encrypt {
    private String postition;

    public void doencrypt(){
        System.out.println(this.postition+": 文件加密...");
    }
}
