package com.yetong.StrategyPattern.EnumStratePattern;

@FunctionalInterface
public interface MsgInterface<T>  {

    void doMsg(T t);
}
