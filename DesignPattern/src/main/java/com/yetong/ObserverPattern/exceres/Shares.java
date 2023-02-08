package com.yetong.ObserverPattern.exceres;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类 股票
 */
public abstract class Shares {

    public Integer rate;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    protected List<StockHolder> list = new ArrayList<>();

    abstract void notifyHolder();

    public void register(StockHolder stockHolder) {
        list.add(stockHolder);
    }


}
