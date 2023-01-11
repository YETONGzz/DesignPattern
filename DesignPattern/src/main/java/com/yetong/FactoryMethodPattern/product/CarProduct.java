package com.yetong.FactoryMethodPattern.product;

public class CarProduct implements Product{
    @Override
    public void message() {
        System.out.println("car产品");
    }
}
