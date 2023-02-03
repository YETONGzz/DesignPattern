package com.yetong.ChainResponsibilityPattern;

public class VicePresident extends ApproverHandler{

    private String name = "副董事长";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void request(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 8000) {
            System.out.println(name + "处理了");
        } else {
            this.handler.request(purchaseRequest);
        }
    }
}
