package com.yetong.DecoratorPattern;

public class ConcerteTwoDecorator extends ComponentDecorator{
    public ConcerteTwoDecorator(Component component) {
        super(component);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        this.bootDisPlay();
    }

    public void bootDisPlay(){
        System.out.println("增强");
    }
}
