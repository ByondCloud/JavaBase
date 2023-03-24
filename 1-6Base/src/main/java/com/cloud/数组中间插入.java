package com.cloud;

import java.util.Scanner;

// 假定有数组{10,12,45,90},需要插入13, 变成{10,12,13,45,90}

public class 数组中间插入 {
    public static void main(String[] args) {
        int a[] = {10, 12, 45, 90};
        int b[] = new int[a.length + 1];
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要插入的数字:");
        int insert = scanner.nextInt();
//        方法1:
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > insert) {
//                s = i;
//                b[i] = insert;
//                break;
//            } else {
//                b[i] = a[i];
//            }
//        }
//        for (int i = s; i < b.length; i++) {
//            if (i > a.length - 1) {
//                break;
//            } else {
//                b[i+1] = a[i];
//            }
//        }

//        方法2:
        boolean flag = true;
        for (int i = 0, j = 0; i < b.length; i++) {
            if (flag) {
                if (a[j] > insert) {
                    flag = false;
                    b[i] = insert;
                } else {
                    b[i] = a[j];
                    j++;
                }
            } else {
                b[i] = a[j];
                j++;
            }
        }


        a = b;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
