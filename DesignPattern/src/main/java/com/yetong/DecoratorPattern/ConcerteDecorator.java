package com.yetong.DecoratorPattern;

/**
 * 具体装饰类
 */
public class ConcerteDecorator extends ComponentDecorator{
    public ConcerteDecorator(Component component) {
        super(component);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        this.boostDisPlay();
    }

    public void boostDisPlay(){
        System.out.println("增强l");
    }
}
