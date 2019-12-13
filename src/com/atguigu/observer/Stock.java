package com.atguigu.observer;

public class Stock extends MySubject{

    @Override
    public void show() {
        for (MyObserver observer : super.observers) {
            System.out.println(observer.getN());
        }
    }
}
