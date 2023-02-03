package com.yetong.StrategyPattern.FactoryStrategyTemplate;

/**
 * 模板类
 */
public abstract class AbstractHandler implements Handler {

    public String des = "";

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public double oneCalcute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double twoCalucte() {
        throw new UnsupportedOperationException();
    }
}
