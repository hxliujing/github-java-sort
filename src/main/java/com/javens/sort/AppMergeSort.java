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
        int a[] = new int[]{12, 2, 44, 4};
        new AppMergeSort().mergeSort(a, 0, a.length - 1);
        SortPrint.print(a);
    }

    private void mergeSort(int[] a, int left, int right) {
        int t = 1;// 每组元素个数
        int size = right - left + 1;
        while (t < size) {
            int s = t;// 本次循环每组元素个数
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                merge(a, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right)
                merge(a, i, i + (s - 1), right);
        }
    }

    private static void merge(int[] data, int p, int q, int r) {
        int[] B = new int[data.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (data[s] <= data[t]) {
                B[k] = data[s];
                s++;
            } else {
                B[k] = data[t];
                t++;
            }
            k++;
        }
        if (s == q + 1)
            B[k++] = data[t++];
        else
            B[k++] = data[s++];
        for (int i = p; i <= r; i++)
            data[i] = B[i];
    }
}