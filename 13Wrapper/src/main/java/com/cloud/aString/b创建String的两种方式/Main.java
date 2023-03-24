package com.cloud.aString.b创建String的两种方式;



/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 13:01
 */
public class Main {
    public static void main(String[] args) {
        String s1 = new String("你好");
        String s2 = "你好";
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
