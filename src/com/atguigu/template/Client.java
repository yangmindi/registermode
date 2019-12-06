package com.atguigu.template;

public class Client {
    public static void main(String[] args) {
        DBOperator dbOperator = new SQLServerDBOperator();
        dbOperator.process();
    }
}
