package com.atguigu.state;

public class Secondary extends AbstractState{
    public Secondary(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.statueName = "熟练";
    }

    public void play(){
        System.out.println("积分翻倍");
        this.point += 10*2;
//        System.out.println("正常游玩");
    }

    @Override
    protected void checkState(int score) {
        if(point >= 0 && point<100){
            acc.setState(new PrimaryState(this));
        }else if(point>=200 && point<300){
            acc.setState(new Professional(this));
        }else if(point>=300 && point<400){
            acc.setState(new Final(this));
        }
    }
}
