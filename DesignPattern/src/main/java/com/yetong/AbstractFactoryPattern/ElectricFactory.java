package com.yetong.AbstractFactoryPattern;

import com.yetong.AbstractFactoryPattern.ElectricProduct.AirConditioner;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Fridge;
import com.yetong.AbstractFactoryPattern.ElectricProduct.Television;

/**
 * 抽象的电器工厂用来生产不同等级结构的电器
 * 抽象工厂模式 有产品族和产品等级结构两个属性
 * 产品族指的是 如海尔工厂可以生产 海尔电视 海尔冰箱 那么 这两个就构成了一个产品族
 * 产品等级结构值得是 同一类产品构成了一个产品等级结构 如海尔电视 海信电视
 * 一个总工厂有多个不同的实现工厂 分别对应着一个个的产品族 如海信工厂 海尔工厂 他们可以生产 如海信等级结构的海信产品族
 * 这样可以大大减少工厂的创建  如5个产品等级 一个产品族由3个产品构成只需 5个工厂便可实现
 * 如果增加产品族的话可以满足开闭原则 无需修改原工厂的的代码 只需 新增一个工厂和一个对应的产品即可
 * 如果增加产品等级结构的话需要新加一个抽象产品 在抽象工厂中新增方法 新增一个对应的产品工厂
 */
public interface ElectricFactory {

    /**
     * createFridge() createAirConditioner createTelevision() 这三个产品,是一个产品族
     */
    Fridge createFridge();

    AirConditioner createAirConditioner();

    Television  createTelevision();
}
