package com.atguigu.template;

public class OracleDBOperator extends DBOperator{
    @Override
    public void connDB() {
        System.out.println("连接Oracle");
    }
}
