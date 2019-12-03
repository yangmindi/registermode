package com.atguigu.state;

public abstract class AbstractState {
    protected GameAccount acc;
    protected int point;
    protected String statueName;
    protected abstract void checkState(int score);

    public void play(int status){
        if(status == 1){
            System.out.println("WIN!!");
            //加10积分
            this.point += 50;
            checkState(point);
            System.out.println("剩余积分为:"+this.point);
        }else {
            System.out.println("FAILS!!");
            //减10积分
            this.point -= 50;
            System.out.println("剩余积分为:"+this.point+"，当前级别为："+statueName);
        }
    }

    public void changeCards(){
        System.out.println("换牌功能");
    }

    public void peekCards(){
        System.out.println("偷看牌功能");
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStatueName() {
        return statueName;
    }

    public void setStatueName(String statueName) {
        this.statueName = statueName;
    }

}
