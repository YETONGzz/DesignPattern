package com.yetong.SimpleFactoryPattern;

public class LineChart implements Chart{

    public LineChart() {
        System.out.println("创建线状图！");
    }

    @Override
    public void display() {
        System.out.println("输出线状态");
    }
}
