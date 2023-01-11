package com.yetong.FactoryMethodPattern.product;

public class GoodsProduct implements Product{
    @Override
    public void message() {
        System.out.println("goods产品");
    }
}
