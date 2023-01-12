package com.yetong.SingletonPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum EnumSingleton {

    INSTANCE;

    public EnumSingleton test() {
        return INSTANCE;
    }

    private Map<String, User> userCfg = new ConcurrentHashMap<>();

    EnumSingleton() {
        loadx();
    }

    private void loadx() {
        loadXX1();
        loadXX2();
    }

    private void loadXX2() {
    }

    private void loadXX1() {
        User user = new User();
        user.setName("悠哈");
        userCfg.put("boss", user);
    }

    public User getUser(String key) {
        User user = userCfg.get(key);
        return user;
    }

}
