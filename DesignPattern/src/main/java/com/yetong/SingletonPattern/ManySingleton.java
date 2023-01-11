package com.yetong.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 多例模式
 */
public class ManySingleton {

    private ManySingleton() {
    }

    public static class HolderClass {
        private static Integer count = null;

        private static List<ManySingleton> list = new ArrayList<>();

        public static void setCount(int num) {
            if (count == null) {
                count = num;
                for (Integer i = 0; i < count; i++) {
                    list.add(new ManySingleton());
                }
            }
        }
    }

    public static void instanceCount(int count) {
        HolderClass.setCount(count);
    }

    public static List<ManySingleton> getInstance(){
        return HolderClass.list;
    }
}
