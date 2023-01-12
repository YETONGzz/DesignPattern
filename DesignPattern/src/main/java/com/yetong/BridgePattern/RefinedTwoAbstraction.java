package com.yetong.BridgePattern;

public class RefinedTwoAbstraction extends Abstraction{


    public RefinedTwoAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSome() {
        System.out.println("refineTwo");
        implementor.doImplement();
    }
}
