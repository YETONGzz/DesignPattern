package com.yetong.SingletonPattern;

import java.util.*;

public class ManySingleton2 {

    private volatile static Integer count = 2;

    private ManySingleton2() {
        count--;
    }

    private static List<ManySingleton2> list = new ArrayList<>();

    public static ManySingleton2 getInstance() {
        if (count > 0) {
            synchronized (count) {
                if (count > 0) {
                    ManySingleton2 manySingleton2 = new ManySingleton2();
                    list.add(manySingleton2);
                    return manySingleton2;
                }
            }
        }
        Random random = new Random();
        int i = random.nextInt(list.size());
        return list.get(i);
    }
}
