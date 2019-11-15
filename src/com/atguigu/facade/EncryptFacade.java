package com.atguigu.facade;

public class EncryptFacade {
    FileReader reader = new FileReader();
    CipherMachine cipher = new CipherMachine();
    FileWriter writer = new FileWriter();

    public EncryptFacade(FileReader reader, CipherMachine cipher, FileWriter writer) {
        this.reader = reader;
        this.cipher = cipher;
        this.writer = writer;
    }

    public void fileEncrypt(String encryptText,String fileNameDes){
        String plainStr = reader.read(fileNameDes);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);
    }
}
