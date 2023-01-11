package com.yetong.AdapterPattern.DoublePattern;

import java.util.Arrays;

/**
 * 适配者类
 */
public class QuickSort {
    public int[] sortScore(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
