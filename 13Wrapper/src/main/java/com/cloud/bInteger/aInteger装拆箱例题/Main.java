package com.cloud.bInteger.aInteger装拆箱例题;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 13:24
 */
public class Main {
    public static void main(String[] args) {
        // 三元运算符应该看做一个整体，所以这里不会出1，而是会整体提升到Double
        Object o1 = true ? new Integer(1) : new Double(2);
        System.out.println(o1.getClass().getName()); // java.lang.Double
        System.out.println(o1); // 1.0

        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2);
        }
        System.out.println(o2.getClass().getName()); // java.lang.Integer
        System.out.println(o2); // 1

    }
}
