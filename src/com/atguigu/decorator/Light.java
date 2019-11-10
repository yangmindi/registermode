package com.atguigu.decorator;

public class Light extends Decorator {
    public Light(Phone obj) {
        super(obj);
        setFunction(" 灯光闪烁 ");
    }
}
