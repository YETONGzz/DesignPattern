package com.yetong.Review.Create.BuilderPattern;

public class BuilderRed implements Builder{

    Cloths cloths = new Cloths();

    @Override
    public void BuildSock() {
        cloths.setSock("红色");
    }

    @Override
    public void BuildTourse() {
        cloths.setTrouser("红色");
    }

    public Cloths getCloths(){
        return cloths;
    }
}
