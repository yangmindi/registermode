package com.atguigu.decorator;
import java.util.List;
public class Decorator extends Phone{
    private Phone phone;

    public Decorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String cost() {
        return phone.getFunction();
    }
}
