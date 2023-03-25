package com.yetong.Review.Structure.BirdgePattern;

public abstract class Direction {

    protected PositionInterface positionInterface;

    public Direction(PositionInterface positionInterface) {
        this.positionInterface = positionInterface;
    }

    abstract void playerDirection();
}
