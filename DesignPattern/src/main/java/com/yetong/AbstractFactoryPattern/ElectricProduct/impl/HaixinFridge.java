package com.yetong.AbstractFactoryPattern.ElectricProduct.impl;

import com.yetong.AbstractFactoryPattern.ElectricProduct.Fridge;

public class HaixinFridge implements Fridge {
    @Override
    public void message() {
        System.out.println("海信冰箱");
    }
}
