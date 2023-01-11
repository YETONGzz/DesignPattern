package com.yetong.AbstractFactoryPattern;

import com.yetong.AbstractFactoryPattern.ElectricProduct.AirConditioner;
import com.yetong.AbstractFactoryPattern.ElectricProduct.impl.HaixinFridge;
import org.junit.Test;

public class TestA {

    @Test
    public void test(){
        HaiXinFactory haiXinFactory = new HaiXinFactory();
        AirConditioner airConditioner = haiXinFactory.createAirConditioner();
        airConditioner.message();
    }
}
