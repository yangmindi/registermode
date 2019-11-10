package com.atguigu.decorator;
import java.util.List;
public abstract class Phone {
    public String des;//描述

    private String function;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    //统计所有功能
    public abstract String cost();//子类实现扩展功能
}
