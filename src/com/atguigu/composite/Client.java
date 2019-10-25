package com.atguigu.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        Folder folder = new Folder("A文件夹","文件夹存储文件");

        //创建文件
        File file = new File("File1", "File内容1");
        File file2 = new File("File2", "File内容2");




        //文件类型
        TextFile textFile = new TextFile("TextFile1", "TextFile1内容");
        ImageFile imageFile = new ImageFile("ImageFile1", "ImageFile1内容");
        VideoFile videoFile = new VideoFile("VideoFile1", "VideoFile1内容");

        TextFile textFile1 = new TextFile("TextFile2", "TextFile2内容");
        ImageFile imageFile1 = new ImageFile("ImageFile2", "ImageFile2内容");
        VideoFile videoFile1 = new VideoFile("VideoFile2", "VideoFile2内容");

        file.add(textFile);
        file.add(imageFile);
        file.add(videoFile);

        file2.add(textFile1);
        file2.add(imageFile1);
        file2.add(videoFile1);

        folder.add(file);
        folder.add(file2);

        folder.print();
        file2.remove(imageFile1);
//        file.print();
        System.out.println();
        folder.print();
    }
}
