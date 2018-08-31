package com.javens.sort;

import com.javens.SortPrint;

/**
 *  快速排序
 *  说明：
 *  要求时间最快时。
 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
 递归的将p左边和右边的数都按照第一步进行，直到不能递归。
 * 稳定性：不稳定
 */
public class AppQuickSort {
    public static void main(String[] args) {
        int a[] = new int[]{12,2,44,4};
        new AppQuickSort().quickSort(a,0,a.length-1);
        SortPrint.print(a);
    }

    private void quickSort(int[] a,int start,int end) {
        if(start<end){
            int baseNum=a[start];//选基准值
            int midNum;//记录中间值
            int i=start;
            int j=end;
            do{
                while((a[i]<baseNum)&&i<end){
                    i++;
                }
                while((a[j]>baseNum)&&j>start){
                    j--;
                }
                if(i<=j){
                    midNum=a[i];
                    a[i]=a[j];
                    a[j]=midNum;
                    i++;
                    j--;
                }
            }while(i<=j);
            if(start<j){
                quickSort(a,start,j);
            }
            if(end>i){
                quickSort(a,i,end);
            }
        }
    }
}
