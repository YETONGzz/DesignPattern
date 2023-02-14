package com.yetong.StatePattern.Crcle;

/**
 * 环境类
 */
public class Screen {

    private StateHandler stateHandler;

    private State currentState, normalState, largerState, largestState;

    public Screen() {
        normalState = new NormalState();
        this.currentState = normalState;
        this.largerState = new LargeState();
        this.largestState = new ThreeState();
    }

    public void disPlay() {

        stateHandler.request();
         
    }
}
