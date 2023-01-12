package com.yetong.BridgePattern;


/**
 * （抽象类）：用于定义抽象类的接口 抽象层
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void doSome(){
    }
}
