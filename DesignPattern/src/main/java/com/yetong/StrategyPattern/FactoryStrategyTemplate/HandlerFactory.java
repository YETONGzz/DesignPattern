package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 工厂类
 */
public class HandlerFactory {
    private static Map<String, Handler> map = new HashMap<>();

    private static List<AbstractHandler> list = new ArrayList<>();

    public static Handler getInvokeHandler(String key) {
        return map.get(key);
    }

    public static Handler getInvokeHandler2(String key) {
        return list.stream().filter(e -> e.getDes().equals(key)).findAny().get();
    }

    public static void register(String key, Handler handler) {
        if (!StringUtils.hasText(key) || null == handler) {
            return;
        }
        map.put(key, handler);
    }

    public static void register2(AbstractHandler handler) {
        list.add(handler);
    }
}
