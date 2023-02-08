package com.yetong.ObserverPattern.exceres;

public class OneHolder implements StockHolder {

    private Shares shares;

    private String name;

    public OneHolder(String name) {
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
