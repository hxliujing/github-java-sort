package com.javens.sort;

import com.javens.SortPrint;

/**
 * 简单选择排序
 * 说明：
 *  常用于取序列中最大最小的几个数时。
 (如果每次比较都交换，那么就是交换排序；如果每次比较完一个循环再交换，就是简单选择排序。)
 遍历整个序列，将最小的数放在最前面。
 遍历剩下的序列，将最小的数放在最前面。
 重复第二步，直到只剩下一个数。
 * 稳定性：稳定
 */
public class AppSelectSort {
    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int value = a[i];
            int position = i;
            for(int j = i+1;j<len;j++){
                if(a[j] <value){
                    value = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = value;
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{12,2,44,4};
        new AppSelectSort().selectSort(a);
        SortPrint.print(a);
    }
}
