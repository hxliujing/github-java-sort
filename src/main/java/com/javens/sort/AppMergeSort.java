package com.javens.sort;

import com.javens.SortPrint;

/**
 *  归并排序
 *  说明：
 *  速度仅次于快速排序，内存少的时候使用，可以进行并行计算的时候使用。
 选择相邻两个数组成一个有序序列。
 选择相邻的两个有序序列组成一个有序序列。
 重复第二步，直到全部组成一个有序序列。
 * 稳定性：稳定
 */
public class AppMergeSort {
    public static void main(String[] args) {
        int a[] = new int[]{12, 2, 44, 4,5};
        new AppMergeSort().mergeSort(a, 0, a.length - 1);
        SortPrint.print(a);
    }

    private void mergeSort(int[] a, int left, int right) {
        int center;
        if(left < right){
            //找出中间索引
            center = (left + right)/2;
            //对左边数组进行递归
            mergeSort(a,0,center);
            //对右边数组进行递归
            mergeSort(a,center + 1,right);
            //合并
            merge(a,left,center,right);
        }
    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] tempArr = new int[data.length];
        int mid = center + 1;
        //third 记录中间数组的索引
        int third = left;
        int temp = left;
        while (left <= center && mid <= right) {
            //从左右两个数组找出最小的数存入tempArr数组
            if (data[left] <= data[mid]) {
                tempArr[third++] = data[left++];
            } else {
                tempArr[third++] = data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while(mid <=right){
            tempArr[third++] = data[mid++];
        }
        while(left <= center){
            tempArr[third++] =  data[left++];
        }
        //将中间数组中的内容复制回原数组
        while(temp <= right){
            data[temp] = tempArr[temp ++ ];
        }

    }
}