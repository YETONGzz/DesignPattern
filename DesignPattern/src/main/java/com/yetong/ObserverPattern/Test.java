package com.yetong.ObserverPattern;


public class Test {
    public static void main(String[] args) {
        Observer observer  = new ConcreteObserver("one");
        Observer tobserver  = new ConcreteObserverTwo("two");
        Subject subject = new ConcreteSubject("one Subject");
        subject.join(tobserver);
        subject.join(observer);
        observer.beAttacked(subject);
    }
}
