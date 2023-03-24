package com.cloud;


public class 转义字符 {

    public static void main(String[] args) {
        // 一个制表位置，实现对齐功能，等同于Tab
        System.out.println("1\t1\t1");
        // 换行
        System.out.println("1\n1\n1");
        // 转义字符\
        System.out.println("C:\\Users\\KK\\Desktop");
        // \"
        System.out.println("老师说:\"好好学习\"");
        // 回车
        System.out.println("好好学习\r天天");

        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

    }

}
