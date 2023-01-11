package com.yetong.SingletonPattern;

/**
 * 最简单的单利模式
 */
public class SingletonOne {
    private static final SingletonOne instance = new SingletonOne();
    private SingletonOne() {
    }
    public static SingletonOne getInstance() {
        return instance;
    }
}
