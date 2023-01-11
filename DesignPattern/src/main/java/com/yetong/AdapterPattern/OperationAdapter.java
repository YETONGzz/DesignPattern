package com.yetong.AdapterPattern;

/**
 * 适配器类 完成对适配者的适配
 */
public class OperationAdapter implements ScoreOperation{

    private BinarySearch binarySearch;

    private QuickSort quickSort;


    public OperationAdapter() {
        binarySearch = new BinarySearch();

        quickSort = new QuickSort();
    }

    @Override
    public int[] sort(int[] arr) {

        return quickSort.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int key) {


        return binarySearch.binarySearch(arr,10);
    }
}
