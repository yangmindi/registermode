package com.atguigu.adapter.classadapter;

//适配器类
public class VolatageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44; //转换成5V
        return dstV;
    }
}
