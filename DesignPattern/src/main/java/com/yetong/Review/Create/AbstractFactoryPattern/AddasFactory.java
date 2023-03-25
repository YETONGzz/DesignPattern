package com.yetong.Review.Create.AbstractFactoryPattern;

public class AddasFactory implements ProductFactory{
    @Override
    public Cloth createCloth() {
        return new AddasCloth();
    }

    @Override
    public Football createFootball() {
        return new AddasFootball();
    }

    @Override
    public Socks createSocks() {
        return new AddasSocks();
    }
}
