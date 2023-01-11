package com.yetong.PrototypePattern;

public interface Doc extends Cloneable{
    void message();

    Doc clone();

}
