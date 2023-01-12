package com.yetong.BridgePattern;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSome() {
        System.out.println("refine");
        implementor.doImplement();
    }
}
