package com.yetong.ObserverPattern;

public class ConcreteObserverTwo implements Observer {

    private String name;

    private Subject subject;

    public ConcreteObserverTwo(String name) {
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
    public void help() {
        System.out.println(name + "来援助了");
    }

    @Override
    public void beAttacked(Subject acc) {
        acc.notifyObserver(this.getName());
    }
}
