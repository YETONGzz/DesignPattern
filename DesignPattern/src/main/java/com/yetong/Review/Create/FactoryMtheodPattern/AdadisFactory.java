package com.yetong.Review.Create.FactoryMtheodPattern;

public class AdadisFactory implements FootballFactory{
    @Override
    public Football create() {
        return new AdadisFootball();
    }
}
