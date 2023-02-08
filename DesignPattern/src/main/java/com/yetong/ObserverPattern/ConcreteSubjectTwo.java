package com.yetong.ObserverPattern;

public class ConcreteSubjectTwo extends Subject{

    public ConcreteSubjectTwo(String name) {
        this.name = name;
    }

    @Override
    void notifyObserver(String name) {
        players.forEach(e -> {
            if (!e.getName().equals(name)) {
                e.help();
            }
        });
    }
}
