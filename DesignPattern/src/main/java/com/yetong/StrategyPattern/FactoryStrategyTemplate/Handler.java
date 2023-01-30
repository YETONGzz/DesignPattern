package com.yetong.StrategyPattern.FactoryStrategyTemplate;

import org.springframework.beans.factory.InitializingBean;

/**
 * 抽象策略类 将算法抽取出来
 * 继承InitializingBean 的原因是重写afterPropertiesSet方法，spring会自动调用afterPropertiesSet方法， 将具体实现类注册到工厂类中。
 */
public interface Handler extends InitializingBean {

    double oneCalcute();

    double twoCalucte();
}
