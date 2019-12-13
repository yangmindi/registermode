package com.atguigu.observer;

public class Client {
    public static void main(String[] args) {
        MySubject subject = new Stock();
        MyObserver obs1;
        obs1 = new Noties();
        obs1.setN(1);
        subject.attach(obs1);
        MyObserver obs2;
        obs2 = new Noties();
        obs2.setN(2);
        subject.attach(obs2);

        subject.show();
    }
}
