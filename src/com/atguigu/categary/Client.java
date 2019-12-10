package com.atguigu.categary;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        BuyStrategy buyStrategy = new ComputerBook();
        System.out.println(buyStrategy.money(20));

    }
}
