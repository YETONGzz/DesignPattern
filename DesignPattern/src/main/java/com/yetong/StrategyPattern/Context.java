package com.yetong.StrategyPattern;

/**
 *Context（环境类）：环境类是使用算法的角色，它在解决某个问题（即实现某个方法）时可以采用多种策略。
 * 在环境类中维持一个对抽象策略类的引用实例，用于定义所采用的策略。
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSome(){
        strategy.doSome();
    }

}
