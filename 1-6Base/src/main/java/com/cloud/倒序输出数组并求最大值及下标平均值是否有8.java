package com.cloud;

import java.util.Random;

public class 倒序输出数组并求最大值及下标平均值是否有8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int max = 0;
        int maxsub = 0;
        double total = 0.0;
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            if (array[i] > max) {
                max = array[i];
                maxsub = i;
            }
            if (array[i] == 8) {
                flag = true;
            }
            total += array[i];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("平均值为:" + total/array.length);
        System.out.println("最大值为:" + max);
        System.out.println("他的下标为:" + maxsub);
        if (flag) {
            System.out.println("有8");
        } else {
            System.out.println("没8");
        }
    }
}
