package com.yetong.FacadePattern;

/**
 * 具体外观类
 */
public class ConcerteFacade implements Facade {

    private OneSubSystem oneSubSystem;

    private TwoSubSystem twoSubSystem;

    public ConcerteFacade() {
        oneSubSystem = new OneSubSystem();
        twoSubSystem = new TwoSubSystem();
    }

    @Override
    public void doSome() {
        oneSubSystem.ok();
        twoSubSystem.ok();
    }
}
