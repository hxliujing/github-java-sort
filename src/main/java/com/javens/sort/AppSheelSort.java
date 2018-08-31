package com.javens.sort;

import com.javens.SortPrint;

/**
 *  希尔排序
 *  说明：
 *  对于直接插入排序问题，数据量巨大时。
   将数的个数设为n，取奇数k=n/2，将下标差值为k的数分为一组，构成有序序列。
   再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
   重复第二步，直到k=1执行简单插入排序。
 * 稳定性：不稳定
 */
public class AppSheelSort {
    public static void main(String[] args) {
        int a[] = new int[]{12,2,44,4};
        new AppSheelSort().sheelSort(a);
        SortPrint.print(a);
    }

    private void sheelSort(int[] a) {
        int len = a.length;
        while (len != 0){
            len = len/2;
            for(int i=0 ; i<len ; i++){
                for(int j=i+len ;j<a.length; j+=len){//元素从第二个开始
                    int k=j-len;//k为有序序列最后一位的位数
                    int temp=a[j];//要插入的元素
                    /*for(;k>=0&&temp<a[k];k-=len){
                        a[k+len]=a[k];
                    }*/
                    while(k>=0&&temp<a[k]){//从后往前遍历
                        a[k+len]=a[k];
                        k-=len;//向后移动len位
                    }
                    a[k+len]=temp;
                }
            }
        }
    }
}
