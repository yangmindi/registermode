package com.atguigu.bridge;

public class Client {
    public static void main(String[] args) {
        Product product = new AirConditioner(new Haier());

        product.getBrand();

        System.out.println("================================");
        Product product1 = new Refrigeratory(new Hisense());
        product1.getBrand();
    }
}
