package com.yetong.BridgePattern;

import org.junit.Test;


public class TestA {

    @Test
    public void test(){
        Abstraction abstraction = new RefinedAbstraction(new RefinedImplementor());
        abstraction.doSome();

        Abstraction abstraction2 = new RefinedTwoAbstraction(new RefinedTwoImplementor());
        abstraction2.doSome();
    }
}
