package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;
public class File extends OrganizationComponent{

    //List中存放的Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public File(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //叶子
    @Override
    protected void print() {
        System.out.println("----------"+getName()+"----------");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }
}
