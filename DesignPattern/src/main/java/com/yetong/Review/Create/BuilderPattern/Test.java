package com.yetong.Review.Create.BuilderPattern;

public class Test {
    public static void main(String[] args) {
        BuilderDirector builderDirector = new BuilderDirector();
        builderDirector.setBuilder(new BuilderGreen());
        System.out.println(builderDirector.createCloth());
    }
}
