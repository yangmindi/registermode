package com.atguigu.composite;

public class TextFile extends OrganizationComponent{

    //没有集合

    public TextFile(String name, String des) {
        super(name, des);
    }

    //叶子结点就不用写remove

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
