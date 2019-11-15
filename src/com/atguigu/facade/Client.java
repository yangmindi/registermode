package com.atguigu.facade;

public class Client {
    public static void main(String[] args) {

        EncryptFacade ef = new EncryptFacade(new FileReader(),new CipherMachine(),new FileWriter());
        ef.fileEncrypt("1.txt","1.txt");
    }
}
