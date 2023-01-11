package com.yetong.BuilderPattern;

/**
 * 建造工厂
 * 声明一系列抽象的构建方法用于创建复杂对象的各个部件
 * 用来构建复杂产品 并得到产品
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getProduct();
}
