package com.cloud;

public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                break;
            }
            a[i] = a[i+1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
