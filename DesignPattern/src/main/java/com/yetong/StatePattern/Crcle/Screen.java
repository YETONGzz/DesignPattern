package com.yetong.StatePattern.Crcle;

/**
 * 环境类
 */
public class Screen {

    private State currentState, normalState, largerState, largestState;

    public Screen() {
        this.currentState = new NormalState();
    }

    public void disPlay(){

    }
}
