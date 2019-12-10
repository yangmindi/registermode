package com.atguigu.categary;

public class ComputerBook implements BuyStrategy{
    @Override
    public int money(int pay) {
        System.out.println("9折");
        return (int) (pay*0.9);
    }
}
