package com.yetong.AbstractFactoryPattern;

import com.yetong.AbstractFactoryPattern.ElectricProduct.AirConditioner;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Fridge;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Television;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaierAir;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaierTelevision;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaixinFridge;

/**
 * 海尔工厂 用来创建 海尔产品族
 */
public class HaierFactory implements ElectricFactory {
    @Override
    public Fridge createFridge() {
        return new HaixinFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAir();
    }

    @Override
    public Television createTelevision() {
        return new HaierTelevision();
    }
}
