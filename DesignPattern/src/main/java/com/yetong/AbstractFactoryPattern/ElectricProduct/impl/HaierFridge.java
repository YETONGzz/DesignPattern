package com.yetong.AbstractFactoryPattern.ElectricProduct.impl;

import com.yetong.AbstractFactoryPattern.ElectricProduct.Fridge;

public class HaierFridge implements Fridge {
    @Override
    public void message() {
        System.out.println("海尔电视");
    }
}
