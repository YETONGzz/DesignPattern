package com.yetong.AdapterPattern.ObjectPattern;

/**
 * 抽象目标类 完成对该类的适配
 */
public interface ScoreOperation {

    int[] sort(int[] arr);

    int search(int[] arr,int key);
}
