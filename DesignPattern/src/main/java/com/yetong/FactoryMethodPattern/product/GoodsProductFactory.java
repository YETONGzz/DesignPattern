package com.yetong.FactoryMethodPattern.product;

public class GoodsProductFactory implements ProductFactory {
    @Override
    public <T extends Product> T creatProduct(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        if (clazz != null) {
            Product product = clazz.newInstance();
            return (T) product;
        }
        return null;
    }
}
