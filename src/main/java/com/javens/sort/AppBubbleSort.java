package com.javens.sort;

import com.javens.SortPrint;

/**
 *  冒泡排序
 *  说明：
 *  将序列中所有元素两两比较，将最大的放在最后面。
 将剩余序列中所有元素两两比较，将最大的放在最后面。
 重复第二步，直到只剩下一个数
 * 稳定性：稳定
 */
public class AppBubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{12,2,44,4};
        new AppBubbleSort().bubbleSort(a);
        SortPrint.print(a);
    }

    private void bubbleSort(int[] a) {
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
