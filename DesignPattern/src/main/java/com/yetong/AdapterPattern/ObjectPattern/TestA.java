package com.yetong.AdapterPattern.ObjectPattern;

import org.junit.Test;

public class TestA {

    @Test
    public void test(){
        int[] arr = {1,8,0,7,5,1,2,6,};
        ScoreOperation scoreOperation = new OperationAdapter();
        System.out.println(scoreOperation.sort(arr));
        for (int i : scoreOperation.sort(arr)) {
            System.out.println(i);
        }
    }
}
