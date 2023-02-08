package com.yetong.ObserverPattern.exceres;

/**
 * 抽象观察者  股民
 */
public interface StockHolder {

    String getName();

    void setName(String name);

    void update(Integer number);
}
