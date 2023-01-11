package com.yetong.SingletonPattern;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(ManySingleton2.getInstance() + "     " + Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        thread.setName("aaa");
        Thread thread1 = new Thread(test2);
        Thread thread2 = new Thread(test2);
        Thread thread4 = new Thread(test2);
        Thread thread3 = new Thread(test2);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

    @Test
    public void test(){
        System.out.println(new HashMap<>());
        Map map = new TreeMap();
        System.out.println();
    }
}
