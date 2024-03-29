package com.atguigu.observer;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList<MyObserver> observers = new ArrayList();

    //注册方法
    public void attach(MyObserver observer){
        observers.add(observer);
    }

    //注销方法
    public void detach(MyObserver observer){
        observers.remove(observer);
    }

    public abstract void show(); //抽象通知方法
}
