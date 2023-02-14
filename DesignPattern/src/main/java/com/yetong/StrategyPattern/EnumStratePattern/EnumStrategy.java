package com.yetong.StrategyPattern.EnumStratePattern;

import java.util.HashMap;
import java.util.Map;

public enum EnumStrategy {

    TEACHER("数学老师", "数学老师在教数学课", PositionStrategy::doSome),

    TEACHER_YUWEN("语文老师", "语文老师在教语文课", PositionStrategy::doSome);

    EnumStrategy(String name, String work, MsgInterface<PositionStrategy> msgInterface) {
        this.name = name;
        this.work = work;
        this.msgInterface = msgInterface;
    }

    private static Map<String, EnumStrategy> map = new HashMap() {{
        put("数学老师", TEACHER);
        put("语文老师", TEACHER_YUWEN);
    }};

    static EnumStrategy[] strategies = values();
    private String name;
    private String work;

    private MsgInterface<PositionStrategy> msgInterface;

    public static void msg(String type) {
        System.out.println(strategies.length);
        EnumStrategy enumStrategy = map.get(type);
        enumStrategy.msgInterface.doMsg(new PositionStrategy(enumStrategy.name,enumStrategy.work));
    }
}
