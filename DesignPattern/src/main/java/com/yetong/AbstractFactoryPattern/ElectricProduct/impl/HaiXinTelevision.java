package com.yetong.AbstractFactoryPattern.ElectricProduct.impl;

import com.yetong.AbstractFactoryPattern.ElectricProduct.Television;

public class HaiXinTelevision implements Television {
    @Override
    public void message() {
        System.out.println("海信电视");
    }
}
