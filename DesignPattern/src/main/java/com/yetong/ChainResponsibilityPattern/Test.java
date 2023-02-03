package com.yetong.ChainResponsibilityPattern;

public class Test {

    public static void main(String[] args) {
        ApproverHandler handler = new Director();
        ApproverHandler handler2 = new VicePresident();
        handler.setNextHandler(handler2);
        handler.request(new PurchaseRequest(6000,100,"djlksajdlk"));
    }
}
