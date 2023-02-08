package com.yetong.ObserverPattern.exceres;

public class TwoHolder implements StockHolder {

    private String name;

    public TwoHolder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Integer number) {
        System.out.println("股民  " + name + "   " + number);
    }
}
