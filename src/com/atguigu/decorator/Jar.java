package com.atguigu.decorator;

public class Jar extends Decorator {
    public Jar(Phone phone) {
        super(phone);
        setFunction(" 震动 ");
    }
}
