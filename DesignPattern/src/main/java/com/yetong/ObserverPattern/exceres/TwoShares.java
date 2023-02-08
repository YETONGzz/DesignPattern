package com.yetong.ObserverPattern.exceres;

public class TwoShares extends Shares {

    @Override
    public Integer getRate() {
        return super.getRate();
    }

    @Override
    public void setRate(Integer rate) {
        super.setRate(rate);
    }

    @Override
    void notifyHolder() {
        list.forEach(e -> e.update(this.getRate()));
    }
}
