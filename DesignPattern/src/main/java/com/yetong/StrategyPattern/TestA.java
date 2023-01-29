package com.yetong.StrategyPattern;

import com.yetong.DecoratorPattern.ConcerteDecorator;
import org.junit.Test;

public class TestA {

    Context context =  new Context(new ConcreteStrategyOne());

    @Test
    public void  test(){
        context.doSome();
    }
}
