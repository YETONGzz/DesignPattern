package com.yetong.Review.Structure.BirdgePattern;

public class LeftDirection extends Direction{
    public LeftDirection(PositionInterface positionInterface) {
        super(positionInterface);
    }

    @Override
    void playerDirection() {
        System.out.println("左方位");
    }
}
