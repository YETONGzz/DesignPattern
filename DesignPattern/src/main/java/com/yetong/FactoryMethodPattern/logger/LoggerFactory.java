package com.yetong.FactoryMethodPattern.logger;

/**
 * 工厂方法模式通过引入工厂等级结构，解决了简单工厂模式中工厂类职责太重的问题，
 * 但由于工厂方法模式中的每个工厂只生产一类产品，可能会导致系统中存在大量的工厂类，势必会增加系统的开销
 */
public interface LoggerFactory {

    Logger createLogger();
}
