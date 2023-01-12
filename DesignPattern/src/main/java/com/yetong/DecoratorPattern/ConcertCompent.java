package com.yetong.DecoratorPattern;

/**
 * 具体构件类
 */
public class ConcertCompent implements Component{
    @Override
    public void disPlay() {
        System.out.println("具体构建");
    }
}
