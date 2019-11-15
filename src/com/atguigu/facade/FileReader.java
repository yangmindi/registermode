package com.atguigu.facade;

public class FileReader {
    private String fileName;

    public FileReader() {
    }

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public String read(String fileName){
        return "读文件..."+fileName;
    }
}
