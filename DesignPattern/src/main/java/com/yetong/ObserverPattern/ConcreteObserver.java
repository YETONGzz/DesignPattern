package com.yetong.ObserverPattern;

/**
 * 具体观察者
 * 在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；
 * 它实现了在抽象观察者Observer中定义的update()方法。通常在实现时，
 * 可以调用具体目标类的attach()方法将自己添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。
 */
public class ConcreteObserver implements Observer {


    private String name;

    private Subject subject;

    public ConcreteObserver(String name) {
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
