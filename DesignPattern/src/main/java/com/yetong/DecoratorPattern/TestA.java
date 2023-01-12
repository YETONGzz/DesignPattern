package com.yetong.DecoratorPattern;


import org.junit.Test;

public class TestA {

    @Test
    public void test(){
        Component component = new ConcertCompent();
        Component decorator = new ConcerteDecorator(component);
        decorator.disPlay();
        Component decorator2 = new ConcerteTwoDecorator(component);
        decorator2.disPlay();
        Component decorator3 = new ConcerteTwoDecorator(decorator2);
        decorator3.disPlay();
    }
}
