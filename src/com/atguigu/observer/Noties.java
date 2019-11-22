package com.atguigu.observer;

public class Noties implements MyObserver{

    @Override
    public void response(int after, int status) {
        if(status == 1){
            System.out.println("观察者检测到股票上涨！！");
            System.out.println("上涨后的价格为:"+after);
        }else {
            System.out.println("观察者检测到股票下降！！");
            System.out.println("下降后的价格为:"+after);
        }
    }
}
