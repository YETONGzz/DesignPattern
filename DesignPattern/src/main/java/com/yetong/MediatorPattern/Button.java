package com.yetong.MediatorPattern;

/**
 * 具体同事者
 * 抽象同事类的子类；每一个同事对象在需要和其他同事对象通信时，先与中介者通信，
 * 通过中介者来间接完成与其他同事类的通信；在具体同事类中实现了在抽象同事类中声明的抽象方法。
 */
public class Button extends Component{
    @Override
    public void update() {
        System.out.println("按钮");
    }
}
