package com.atguigu.stream;

import java.io.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class IOTest {

    public static void main(String[] args) throws IOException {
        String name = "D:\\尚硅谷\\尚硅谷图解设计模式\\My设计模式\\src\\com\\atguigu\\stream\\Student";
        File file = new File(name);

        readFile(name);
    }

    public static void readFile(String strFile) {
        try {
            InputStream is = new FileInputStream(strFile);
            int iAvail = is.available();
            byte[] bytes = new byte[iAvail];
            is.read(bytes);

            String s = new String(bytes);


            String res = "";
            String[] split = s.split(",");
            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    res += split[i] + "{\n";
                } else {
                    String row = split[i];
                    String[] col = row.split(" ");
                    for (int j = 0; j < col.length - 3; j++) {
                        if (col[j].equals("\r\nproperty")) {
                            res+=col[j+3] + " " + col[j+2] + " " + col[j+1] + ";\n";
                        }else if(col[j].equals("\r\nmethod")){
                            res+=col[j+3] + " " + col[j+2] + " " + col[j+1] + "{}\n";
                        }
                    }
                }
            }
            res += "}";

            File file = new File("D:\\尚硅谷\\尚硅谷图解设计模式\\My设计模式\\src\\com\\atguigu\\stream\\Out.txt");
            Writer out = new FileWriter(file);
            out.write(res);
            out.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
