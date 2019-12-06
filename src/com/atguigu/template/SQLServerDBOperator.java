package com.atguigu.template;

public class SQLServerDBOperator extends DBOperator{
    @Override
    public void connDB() {
        System.out.println("连接SQL Server");
    }
}
