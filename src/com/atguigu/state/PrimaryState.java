package com.atguigu.state;

public class PrimaryState extends AbstractState{
    public PrimaryState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.statueName = "新手";
    }

    public PrimaryState(GameAccount acc){
        this.point = 0;
        this.acc = acc;
        this.statueName = "新手";
    }

    public void play(){
        System.out.println("积分正常");
    }

    @Override
    protected void checkState(int score) {
        if(point >= 100 && point<200){
            acc.setState(new Secondary(this));
        }else if(point>=200 && point<300){
            acc.setState(new Professional(this));
        }else if(point>=300 && point<400){
            acc.setState(new Final(this));
        }
    }
}
