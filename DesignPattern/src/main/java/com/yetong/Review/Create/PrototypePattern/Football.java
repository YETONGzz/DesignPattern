package com.yetong.Review.Create.PrototypePattern;

public class Football implements Ball{
    @Override
    public void tick() {
        System.out.println("替他一屉屉");
    }

    @Override
    public Ball clone() {
        try {
            return (Ball) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
