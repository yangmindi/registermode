package com.atguigu.state;

public class Professional extends AbstractState{

    public Professional(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.statueName = "高手";
    }

    public void play(){
        System.out.println("积分翻倍+交换牌");
        this.point += 10*2;
//        System.out.println("正常游玩");
    }

    @Override
    protected void checkState(int score) {
        if(point >= 0 && point<100){
            acc.setState(new PrimaryState(this));
        }else if(point>=100 && point<200){
            acc.setState(new Secondary(this));
        }else if(point>=300 && point<400){
            acc.setState(new Final(this));
        }
    }
}
