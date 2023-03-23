package com.yetong.Review.Create.SinglePattern;

public enum SingleEnum {


    INSTANCE;

    private String name;

    public static SingleEnum getInstance(){
        return INSTANCE;
    }

    SingleEnum() {
        this.name = "夜瞳";
    }

    public static void main(String[] args) {
        SingleEnum instance = SingleEnum.getInstance();
        SingleEnum instance1 = SingleEnum.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
