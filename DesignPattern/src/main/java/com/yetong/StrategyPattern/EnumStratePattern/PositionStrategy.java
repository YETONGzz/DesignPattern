package com.yetong.StrategyPattern.EnumStratePattern;

import org.omg.CORBA.StringHolder;

import java.util.HashMap;
import java.util.Optional;

public class PositionStrategy {

    private  String name;

    private  String work;

    public PositionStrategy(String name, String work) {
        this.name = name;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void doSome() {
        System.out.println(name + " " + work);
    }
}
