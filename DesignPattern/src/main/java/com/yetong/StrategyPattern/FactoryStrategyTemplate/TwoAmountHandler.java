package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.stereotype.Component;

/**
 * 具体策略类
 */
@Component
public class TwoAmountHandler extends AbstractHandler{

    public String des = "two";

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public double twoCalucte() {
        return 100;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerFactory.register("2",this);
    }
}
