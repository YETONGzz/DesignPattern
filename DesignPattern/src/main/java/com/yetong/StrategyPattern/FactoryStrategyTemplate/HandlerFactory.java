package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 */
public class HandlerFactory {
    private static Map<String, Handler> map = new HashMap<>();

    public static Handler getInvokeHandler(String key) {
        return map.get(key);
    }

    public static void register(String key, Handler handler) {
        if (!StringUtils.hasText(key) || null == handler) {
            return ;
        }
        map.put(key,handler);
    }
}
