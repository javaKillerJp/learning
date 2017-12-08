package edu.jp.sort;

/**
 * Created by Administrator on 2017/12/8.
 */
public class InsertSort {

    public void sort(int[] srcs){
        if (srcs == null || srcs.length < 2){
            return;
        }
        for (int flag = 0; flag < srcs.length; flag++) {
            for (int index = flag; index > 0; index--) {
                if (srcs[index] < srcs[index - 1]){
                    int temp = srcs[index];
                    srcs[index] = srcs[index - 1];
                    srcs[index - 1] = temp;
                }
            }
        }
    }
}
