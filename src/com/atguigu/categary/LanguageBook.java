package com.atguigu.categary;

public class LanguageBook implements BuyStrategy{
    @Override
    public int money(int pay) {
        System.out.println("优惠两元");
        return pay-2;
    }
}
