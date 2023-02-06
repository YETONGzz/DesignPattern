package com.yetong.MediatorPattern;

/**
 * 抽象同事类
 * 定义各个同事类公有的方法，并声明了一些抽象方法来供子类实现，
 * 同时它维持了一个对抽象中介者类的引用，其子类可以通过该引用来与中介者通信。
 */
public abstract class Component {

    //维护一个抽象中介者 用来和其他同事类交互
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
