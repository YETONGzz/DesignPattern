package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.stereotype.Component;

@Component
public class FixAmountHandler extends AbstractHandler{

    public String des = "fix";

    @Override
    public double oneCalcute() {
        return 100;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerFactory.register2(this);
    }

    @Override
    public String getDes() {
        return des;
    }

    @Override
    public void setDes(String des) {
        this.des = des;
    }
}
