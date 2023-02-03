package com.yetong.ChainResponsibilityPattern;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * 具体处理者
 */
public class Director extends ApproverHandler {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void request(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 5000) {
            System.out.println(name + "处理了");
        } else {
            this.handler.request(purchaseRequest);
        }
    }

}
