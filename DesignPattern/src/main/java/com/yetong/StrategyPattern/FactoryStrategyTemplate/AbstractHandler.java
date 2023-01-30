package com.yetong.StrategyPattern.FactoryStrategyTemplate;

/**
 * 模板类
 */
public abstract class AbstractHandler implements Handler {

    @Override
    public double oneCalcute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double twoCalucte() {
        throw new UnsupportedOperationException();
    }
}
