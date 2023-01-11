package com.yetong.BuilderPattern;

/**
 * 指挥者 决定对象的创建过程
 * 隔离了客户与对象的创建过程
 */
public class Director {

    private Builder builder;
    public Director(Builder builder) {

        this.builder = builder;

    }
    public void setBuilder(Builder builder) {

        this.builder = builder;

    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }

}
