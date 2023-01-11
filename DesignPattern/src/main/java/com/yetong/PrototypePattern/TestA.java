package com.yetong.PrototypePattern;

import org.junit.Test;

public class TestA {
    public static void main(String[] args) {
            System.out.println();
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();
        Doc far = prototypeManager.getOfficialDocument("far");
            far.message();
    }
}
