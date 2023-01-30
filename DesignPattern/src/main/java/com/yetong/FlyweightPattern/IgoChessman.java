package com.yetong.FlyweightPattern;


/**
 * 抽象享元类
 */
abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}
