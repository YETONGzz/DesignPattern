package com.yetong.ChainResponsibilityPattern.exercise;

/**
 *
 */
public abstract class ApproverHandler {

    protected ApproverHandler handler;

    public void setNextHandler(ApproverHandler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(FalseNote falseNote);
}
