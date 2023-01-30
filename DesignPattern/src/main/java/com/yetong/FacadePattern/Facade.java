package com.yetong.FacadePattern;

/**
 * 抽象外观类  当有新的子系统出现时只需要增加一个具体外观类即可实现子系统的解耦
 *
 */
public interface Facade {

    void doSome();
}
