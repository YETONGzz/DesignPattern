package com.yetong.AbstractFactoryPattern;

import com.yetong.AbstractFactoryPattern.ElectricProduct.AirConditioner;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Fridge;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Television;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaiXinAir;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaiXinTelevision;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaixinFridge;
import org.hamcrest.Factory;

/**
 * 海信工厂  创建海信产品族
 */
public class HaiXinFactory implements ElectricFactory {
    @Override
    public Fridge createFridge() {
        return new HaixinFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaiXinAir();
    }

    @Override
    public Television createTelevision() {
        return new HaiXinTelevision();
    }
}
