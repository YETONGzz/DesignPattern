package com.yetong.ObserverPattern;

/**
 * 具体目标是目标类的子类，通常它包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知；
 * 同时它还实现了在目标类中定义的抽象业务逻辑方法（如果有的话）。如果无须扩展目标类，则具体目标类可以省略。
 */
public class ConcreteSubject extends Subject {

    public ConcreteSubject(String name) {
        this.name = name;
    }


    //通知观察者
    @Override
    public void notifyObserver(String name) {
//        players.forEach(e -> {
//            if (!e.getName().equals(name)) {
//                e.help();
//            }
//        });
        for (Observer player : players) {
            if (!player.getName().equals(name)) {
                player.help();
            }
        }
    }
}
