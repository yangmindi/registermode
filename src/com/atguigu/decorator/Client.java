package com.atguigu.decorator;

public class Client {
    public static void main(String[] args) {
        Phone phone = new SimplePhone();
        phone.setFunction(new Decorator(new Song(phone)).cost());
        System.out.println(phone.getDes() + " " + phone.getFunction());

        Phone phone1 = new JarPhone();
        phone1.setFunction(new Decorator(new Jar(phone1)).cost());
        System.out.println(phone1.getDes() + " " + phone1.getFunction());

        Phone phone2 = new ComplexPhone();
        phone2.setFunction(new Decorator(new Light(phone2)).cost());
        System.out.println(phone2.getDes() + " " + phone2.getFunction());
    }
}
