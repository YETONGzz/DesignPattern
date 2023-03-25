package com.yetong.Review.Create.PrototypePattern;

public interface Ball extends Cloneable{

    void tick();

    Ball clone();
}
