package com.yetong.ObserverPattern;

/**
 * 观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了目标对象变换时做出相应动作的方法，因此又称为抽象观察者。
 */
public interface Observer {

    String getName();

    void setName(String name);

    void help(); //支援盟友方法  目标对象变化时要做出的动作

    void beAttacked(Subject acc); //声明遭受攻击方法
}
