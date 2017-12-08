package edu.jp.sort;

/**
 * Created by Administrator on 2017/12/8.
 */
public class BubbleSort {

    public void sort(int[] arrs){
        int size = arrs.length;
        for (int i = 1; i <= arrs.length; i++) {
            int last = arrs[size - i];
            for (int j = size -i; j >= 0; j--){
                if (last < arrs[j]){
                    swap(arrs,size - i,j);
                }
            }
        }
    }

    private void swap(int[] arrs,int a, int b){
        int tmp = arrs[a];
        arrs[a] = arrs[b];
        arrs[b] = tmp;
    }
}
