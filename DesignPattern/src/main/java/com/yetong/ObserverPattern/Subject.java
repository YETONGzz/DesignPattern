package com.yetong.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 * 目标又称为主题，它是指被观察的对象。在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，
 * 它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。目标类可以是接口，也可以是抽象类或具体类。
 */
public abstract class Subject {

    //定义一个集合用于存储战队成员
    List<Observer> players = new ArrayList();

    public String name;

    abstract void notifyObserver(String name);

    public void join(Observer player) {
        players.add(player);
    }

    public void quit(Observer player) {
        players.remove(player);
    }

    ;
}
