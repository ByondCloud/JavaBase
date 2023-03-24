package com.cloud.e处理流.d标准输入输出流;

import java.util.Scanner;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:36
 */
public class Main {
    public static void main(String[] args) {

        // 点进去看构造器，就是个InputStream输入流
        Scanner scanner = new Scanner(System.in);

        // java.io.PrintStream 输出流
        System.out.println(System.out.getClass());
    }
}
