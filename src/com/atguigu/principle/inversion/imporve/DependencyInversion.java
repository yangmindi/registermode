package com.atguigu.principle.inversion.imporve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceive{
    public String getInfo();
}

class WeiXin implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息：hello,ok";
    }
}

class Email implements IReceive{

    @Override
    public String getInfo() {
        return "电子邮件信息：hello,world";
    }
}


class Person{
    public void receive(IReceive receiver){
        System.out.println(receiver.getInfo());
    }
}
