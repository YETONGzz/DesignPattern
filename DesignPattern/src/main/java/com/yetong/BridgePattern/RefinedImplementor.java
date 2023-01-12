package com.yetong.BridgePattern;

/**
 * 扩充实现类
 */
public class RefinedImplementor implements Implementor{
    @Override
    public void doImplement() {
        System.out.println("refineImplemetero");
    }
}
