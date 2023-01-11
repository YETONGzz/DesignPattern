package com.yetong.BuilderPattern;

/**
 * 复杂产品的具体创建过程
 */
public class ConcreteBuilder implements Builder{

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.partA = "测试a";
    }

    @Override
    public void buildPartB() {
        product.partB = "测试b";
    }

    @Override
    public void buildPartC() {
        product.partC = "测试c";
    }

    @Override
    public Product getProduct() {
        return product;
    }


}
