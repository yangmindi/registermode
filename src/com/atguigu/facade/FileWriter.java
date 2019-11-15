package com.atguigu.facade;

public class FileWriter {
    private String encryText;
    private String fileNameDes;

    public FileWriter() {
    }

    public FileWriter(String encryText, String fileNameDes) {
        this.encryText = encryText;
        this.fileNameDes = fileNameDes;
    }

    public void write(String encryText,String fileNameDes){
        System.out.println("加密文件..."+encryText+"文件名称为："+fileNameDes);
    }
}
