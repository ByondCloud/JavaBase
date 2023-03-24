package com.cloud;

import java.util.Scanner;

public class for循环金字塔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLevel = scanner.nextInt();

        for (int i = 1; i <= totalLevel; i++) {
            for (int j = 0; j <totalLevel-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
