package com.yetong.Review.Structure.BirdgePattern;

public class RightDirection extends Direction{
    public RightDirection(PositionInterface positionInterface) {
        super(positionInterface);
    }

    @Override
    void playerDirection() {
        System.out.println("右方位");
    }
}
