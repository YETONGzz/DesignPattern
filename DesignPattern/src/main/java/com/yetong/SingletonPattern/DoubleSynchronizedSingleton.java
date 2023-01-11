package com.yetong.SingletonPattern;

/**
 * 双重锁懒汉式可以防止线程安全问题
 */
public class DoubleSynchronizedSingleton {

    private volatile static DoubleSynchronizedSingleton instance = null;

    private DoubleSynchronizedSingleton() {
    }

    public static DoubleSynchronizedSingleton getInstance() {
        //当实例为空的时候开始抢锁
        if (instance == null) {
            synchronized (instance) {
                //获取到了锁之后需要进一步判断实例是否为空，这样可以避免其他的线程抢到了锁之后不知道实例有没有被创建额导致重复创建实例
                if (instance == null) {
                    instance = new DoubleSynchronizedSingleton();
                }
            }
        }
        return instance;
    }

}

