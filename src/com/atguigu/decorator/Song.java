package com.atguigu.decorator;

public class Song extends Decorator {

    public Song(Phone obj) {
        super(obj);
        setFunction(" 响铃 ");
    }
}
