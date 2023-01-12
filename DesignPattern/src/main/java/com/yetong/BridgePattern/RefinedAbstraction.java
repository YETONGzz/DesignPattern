package com.yetong.BridgePattern;

/**
 * 扩充抽象类）：扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类
 */
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
