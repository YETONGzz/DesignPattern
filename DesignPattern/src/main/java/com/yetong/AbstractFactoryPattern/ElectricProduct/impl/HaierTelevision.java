package com.yetong.AbstractFactoryPattern.ElectricProduct.impl;

import com.yetong.AbstractFactoryPattern.ElectricProduct.Television;

public class HaierTelevision implements Television {
    @Override
    public void message() {
        System.out.println("海尔电视");
    }
}
