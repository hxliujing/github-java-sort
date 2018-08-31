package com.javens.sort;

import com.javens.SortPrint;

/**
 * 直接插入排序
 * 说明：
 *  我们经常会到这样一类排序问题：把新的数据插入到已经排好的数据列中。
 *  将第一个数和第二个数排序，然后构成一个有序序列将第三个数插入进去，
 *  构成一个新的有序序列。对第四个数、第五个数……直到最后一个数，重复第二步。
 *  稳定性：稳定
 */
public class AppInsertSort {
    public void insertSort(int[] a){
        int len = a.length;
        int insertNum = 0;
        for(int i=0;i<len;i++){
            insertNum = a[i];
            int j = i - 1;
            while (j>=0 && a[j] > insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{12,2,44,4};
        new AppInsertSort().insertSort(a);
        SortPrint.print(a);
    }
}
