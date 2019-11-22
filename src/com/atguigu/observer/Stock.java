package com.atguigu.observer;

public class Stock extends MySubject{

    @Override
    public int up(int before,int after) {
        int flag = 0;
        if((before*0.05+before)<after){
            System.out.println("股票上涨超过5%");
            System.out.println("-------");
            flag = 1;
        }else if(after<(before-(before*0.05))){
            System.out.println("股票下降超过5%");
            System.out.println("-------");
        }
        for (Object observer : observers) {
            ((MyObserver)observer).response(after,flag);
        }
        return after;
    }
}
