package com.atguigu.state;

public class Client {
    public static void main(String[] args) {
        GameAccount account = new GameAccount("张三");
        account.play(1);
        account.play(1);
        account.play(1);
        account.play(1);
        account.getState();
        account.changeCards();
        account.peekCards();
        account.getState();
    }
}
