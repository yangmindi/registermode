package com.atguigu.decorator;

public class PhoneProduct extends Phone{

    @Override
    public String cost() {
        return super.getFunction();
    }
}
