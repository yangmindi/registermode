package com.atguigu.state;

public class GameAccount {
    private AbstractState state;
    private String name;

    public GameAccount(String name) {
        this.name = name;
        this.state = new PrimaryState(this);
        System.out.println(this.name + "注册成功");
        System.out.println("-----------------------");
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(int point){
        state.play(point);
    }

    public void changeCards(){
        state.changeCards();
    }

    public void peekCards(){
        state.peekCards();
    }
}
