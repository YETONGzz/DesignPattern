package com.yetong.AdapterPattern.DoublePattern;

/**
 * 适配器类
 * 双向适配器 适配者可以使用目标对象的方法  目标对象可以使用适配者的方法
 * 双向适配器使用场景和作用，当target和adaptee相互间都需要对方的业务，
 * 但它们之间都不知道所需业务具体的接口而自定义一个大概接口。双向适配器开始起作用了，
 * 利用适配器的两个构造器生成两个相反的适配器对象来分别供双方使用
 */
public class Adapter extends QuickSort implements Score {

    private QuickSort quickSort;

    private Score score;


    public Adapter(QuickSort quickSort){
        this.quickSort = quickSort;
    }

    public Adapter(Score score){
        this.score = score;
    }

    /**
     * 内部走的quickSort的方法
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        quickSort.sortScore(arr);
        return arr;
    }

    @Override
    public int[] sortScore(int[] arr) {
        score.sort(arr);
        return arr;
    }
}
