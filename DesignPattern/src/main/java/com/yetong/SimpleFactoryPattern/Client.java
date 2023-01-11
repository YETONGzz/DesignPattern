package com.yetong.SimpleFactoryPattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Chart chart = ChartFactory.getChart(HashMap.class);
        chart.display();
    }
}
