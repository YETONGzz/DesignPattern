package com.yetong.MediatorPattern;

/**
 * 抽象中介者
 * 定义一个接口，该接口用于与各同事对象之间进行通信。
 */
public interface Mediator {

    void componentChanged(Component c);
}
