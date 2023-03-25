package com.yetong.Review.Create.FactoryMtheodPattern;

import org.springframework.cglib.proxy.Factory;

public class NikeFactory implements FootballFactory {
    @Override
    public Football create() {
        return new NikeFootball();
    }
}
