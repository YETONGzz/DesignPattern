package com.yetong.BuilderPattern;

public class TestA {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getProduct();
        System.out.println(product.partA);
    }

}
