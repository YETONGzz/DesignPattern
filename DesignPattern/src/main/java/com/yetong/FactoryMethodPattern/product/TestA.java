package com.yetong.FactoryMethodPattern.product;

import org.junit.Test;

public class TestA {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        GoodsProductFactory goodsProductFactory = new GoodsProductFactory();
        GoodsProduct goodsProduct = goodsProductFactory.creatProduct(GoodsProduct.class);
        goodsProduct.message();
    }
}
