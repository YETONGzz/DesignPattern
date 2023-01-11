package com.yetong.FactoryMethodPattern.product;

public interface ProductFactory {

    <T extends Product> T creatProduct(Class<T> clazz) throws InstantiationException, IllegalAccessException;
}
