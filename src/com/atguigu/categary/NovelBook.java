package com.atguigu.categary;

public class NovelBook implements BuyStrategy{
    @Override
    public int money(int pay) {
        System.out.println("满100减10");
        int a = pay / 100 * 10;
        return pay - a;
    }
}
