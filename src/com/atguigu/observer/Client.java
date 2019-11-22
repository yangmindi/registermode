package com.atguigu.observer;

public class Client {
    public static void main(String[] args) {
        MySubject subject = new Stock();
        MyObserver obs1;
        obs1 = new Noties();

        subject.attach(obs1);

        subject.up(100,50);
    }
}
