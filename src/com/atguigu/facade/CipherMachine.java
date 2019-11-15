package com.atguigu.facade;

public class CipherMachine {
    private String plainText;

    public CipherMachine() {
    }

    public CipherMachine(String plainText) {
        this.plainText = plainText;
    }

    public String encrypt(String plainText){
        return "文件加密..."+plainText;
    }
}
