package com.javens;

public class SortPrint {
    public static void print(int a[]){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
            if(i!=(a.length-1)){
                sb.append(" ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
