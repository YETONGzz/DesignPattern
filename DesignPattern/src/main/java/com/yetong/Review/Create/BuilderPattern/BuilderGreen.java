package com.yetong.Review.Create.BuilderPattern;

public class BuilderGreen implements Builder{
    Cloths cloths = new Cloths();

    @Override
    public void BuildSock() {
        cloths.setSock("绿色");
    }

    @Override
    public void BuildTourse() {
        cloths.setTrouser("绿色");
    }

    public Cloths getCloths(){
        return cloths;
    }
}
