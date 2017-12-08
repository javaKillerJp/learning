package edu.jp.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/12/8.
 */
//希尔排序
public class ShellSort {
    public void sort(int[] a) {
        int j, gap;
        int n = a.length;
        for (gap = n / 2; gap > 0; gap /= 2)
            for (j = gap; j < n; j++)//从数组第gap个元素开始
                if (a[j] < a[j - gap])//每个元素与自己组内的数据进行直接插入排序
                {
                    int temp = a[j];
                    int k = j - gap;
                    while (k >= 0 && a[k] > temp)
                    {
                        a[k + gap] = a[k];
                        k -= gap;
                    }
                    a[k + gap] = temp;
                }
    }
}
