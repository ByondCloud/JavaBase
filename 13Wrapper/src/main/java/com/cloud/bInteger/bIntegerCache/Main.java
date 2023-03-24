package com.cloud.bInteger.bIntegerCache;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 13:31
 */
public class Main {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 20;
        System.out.println(a == b); // true

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d); // false

        Integer e = new Integer(100);
        Integer f = 100;
        System.out.println(e == f); // false

    }
}
