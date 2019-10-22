package com.atguigu.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getinfo(){
        return "电子邮件信息：hello,world";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getinfo());
    }
}