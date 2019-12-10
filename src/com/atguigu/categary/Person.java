package com.atguigu.categary;

public class Person {
    private BuyStrategy buyStrategy;

    public int buy(int a){
        int money = buyStrategy.money(a);
        return money;
    }
}
