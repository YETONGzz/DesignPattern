package com.yetong.PrototypePattern;

public class Far implements Doc {
    @Override
    public void message() {
        System.out.println("far");
    }

    @Override
    public Doc clone()  {
        try {
            return (Doc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
