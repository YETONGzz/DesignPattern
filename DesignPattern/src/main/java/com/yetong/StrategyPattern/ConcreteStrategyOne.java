package com.yetong.StrategyPattern;

/**
 * 具体策略类
 */
public class ConcreteStrategyOne implements Strategy{
    @Override
    public void doSome() {
        System.out.println("策略one");
    }
}
