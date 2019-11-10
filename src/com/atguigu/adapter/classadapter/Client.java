package com.atguigu.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===适配器类===");
        Phone phone = new Phone();
        phone.charging(new VolatageAdapter());
    }
}
