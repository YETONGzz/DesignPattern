package com.yetong.StrategyPattern.FactoryStrategyTemplate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class TestA {

    public static void main(String[] args) {
        SpringApplication.run(TestA.class);
        Handler invokeHandler = HandlerFactory.getInvokeHandler2("fix");
        System.out.println(invokeHandler.oneCalcute());
    }
}
