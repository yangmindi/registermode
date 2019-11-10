package com.atguigu.facade;

public class Outencrypt {
    private Encrypt encrypt;
    private Read read;
    private Save save;

    public Outencrypt(){
        encrypt = new Encrypt();
        read = new Read();
        save = new Save();
    }

    public void on(){
        encrypt.doencrypt();
        read.doread();
        save.dosave();
    }
}
