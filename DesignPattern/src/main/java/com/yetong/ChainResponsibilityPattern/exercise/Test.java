package com.yetong.ChainResponsibilityPattern.exercise;

public class Test {
    public static void main(String[] args) {
        ApproverHandler director = new Director();
        ApproverHandler manager = new Manager();
        director.setNextHandler(manager);
        director.handleRequest(new FalseNote(5));
    }
}
