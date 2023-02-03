package com.yetong.ChainResponsibilityPattern.exercise;

import lombok.Data;

import java.util.Optional;

public class Director extends ApproverHandler {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "主任";

    @Override
    public void handleRequest(FalseNote falseNote) {
        Optional.ofNullable(falseNote).filter(e -> e.getDay() < 3).ifPresent(e -> System.out.println(name + "执行了"));
        if (falseNote.getDay() < 3) {
            System.out.println(name + "执行了");
        } else {
            this.handler.handleRequest(falseNote);
        }
    }
}
