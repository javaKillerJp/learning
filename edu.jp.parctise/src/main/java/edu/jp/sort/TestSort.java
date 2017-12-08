package edu.jp.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/12/8.
 */
public class TestSort {

    @Test
    public void testInsertSort(){
        int[] arrs = new int[]{7,1,6,2};
        new InsertSort().sort(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    @Test
    public void testShellSort(){
        int[] arrs = new int[]{7,1,6,2};
        new ShellSort().sort(arrs);
        System.out.println(Arrays.toString(arrs));

        int[] arrs2 = new int[]{7,1,6,2,5};
        new ShellSort().sort(arrs2);
        System.out.println(Arrays.toString(arrs2));
    }

    @Test
    public void testBubbleSort(){
        int[] arrs = new int[]{7,1,6,2};
        new BubbleSort().sort(arrs);
        System.out.println(Arrays.toString(arrs));

        int[] arrs2 = new int[]{7,1,6,2,5};
        new BubbleSort().sort(arrs2);
        System.out.println(Arrays.toString(arrs2));
    }
}
