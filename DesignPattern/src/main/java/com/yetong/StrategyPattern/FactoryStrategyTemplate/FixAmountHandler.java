package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.stereotype.Component;

@Component
public class FixAmountHandler extends AbstractHandler{
    @Override
    public double oneCalcute() {
        return 100;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
