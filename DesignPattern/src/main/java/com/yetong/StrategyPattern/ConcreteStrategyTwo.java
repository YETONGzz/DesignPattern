package com.yetong.StrategyPattern;

public class ConcreteStrategyTwo implements Strategy{
    @Override
    public void doSome() {
        System.out.println("策略two");
    }
}
