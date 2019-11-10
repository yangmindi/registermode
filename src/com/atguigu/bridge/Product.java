package com.atguigu.bridge;

public abstract class Product {
    //品牌
    private Brand brand;

    public Product(Brand brand) {
        this.brand = brand;
    }

    protected void getBrand(){
        this.brand.getBrand();
    }
}
