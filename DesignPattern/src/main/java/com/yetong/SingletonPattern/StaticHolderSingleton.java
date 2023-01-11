package com.yetong.SingletonPattern;

/**
 * 静态内部类方式
 */
public class StaticHolderSingleton {

    private StaticHolderSingleton() {
    }


    public static class Holder{
        private static StaticHolderSingleton instance = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance(){
        return Holder.instance;
    }
}
