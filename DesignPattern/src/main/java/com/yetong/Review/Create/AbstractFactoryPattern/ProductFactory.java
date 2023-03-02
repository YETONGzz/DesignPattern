package com.yetong.Review.Create.AbstractFactoryPattern;

public interface ProductFactory {

    Cloth createCloth();

    Football createFootball();

    Socks createSocks();
}
