package com.yetong.SingletonPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 懒汉式
 * 会存在线程安全问题
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private List<String> list = null;

    private LazySingleton() {
        list = new ArrayList<>();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void addServer(String server) {
        list.add(server);
    }

    //删除服务器
    public void removeServer(String server) {
        list.remove(server);
    }

    //使用Random类随机获取服务器
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(list.size());
        return list.get(i);
    }


}
