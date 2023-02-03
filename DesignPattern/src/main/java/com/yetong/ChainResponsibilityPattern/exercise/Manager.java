package com.yetong.ChainResponsibilityPattern.exercise;

import java.util.Optional;

public class Manager extends ApproverHandler {
    private String name = "经理";

    @Override
    public void handleRequest(FalseNote falseNote) {
        if (falseNote.getDay() < 10 || falseNote.getDay() >= 3) {
            System.out.println(name + "执行了");
        } else {
            this.handler.handleRequest(falseNote);
        }
    }
}
