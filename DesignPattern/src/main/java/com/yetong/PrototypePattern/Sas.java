package com.yetong.PrototypePattern;

public class Sas implements Doc{
    @Override
    public void message() {
        System.out.println("sas");
    }

    @Override

    public Doc clone() {
        try {
            return (Doc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
