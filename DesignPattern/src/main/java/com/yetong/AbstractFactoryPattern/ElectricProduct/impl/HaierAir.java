package com.yetong.AbstractFactoryPattern.ElectricProduct.impl;

import com.yetong.AbstractFactoryPattern.ElectricProduct.AirConditioner;

public class HaierAir implements AirConditioner {
    @Override
    public void message() {
        System.out.println("海尔空调");
    }
}
