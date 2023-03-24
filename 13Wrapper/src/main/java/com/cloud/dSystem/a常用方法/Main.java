package com.cloud.dSystem.a常用方法;

import java.util.Arrays;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 15:00
 */
public class Main {
    public static void main(String[] args) {

//        System.exit(0); // 退出程序

        int[] arr = {1, 2, 3};
        int [] arr2 = new int[3];

        //   源数组  源数组起始位置 目标数组 目标数组起始位置  拷贝多少个数组
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));

        int[] ints = Arrays.copyOf(arr, 3);

    }
}
