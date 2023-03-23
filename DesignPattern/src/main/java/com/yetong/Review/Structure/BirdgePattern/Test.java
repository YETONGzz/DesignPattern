package com.yetong.Review.Structure.BirdgePattern;

public class Test {

    public static void main(String[] args) {
        Direction direction = new LeftDirection(new VanguardPosition());
        direction.playerDirection();
        direction.positionInterface.playerPosition();
    }
}
