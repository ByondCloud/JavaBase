package com.cloud.b自定义泛型;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 6:20
 */
public class Main {
    public static void main(String[] args) {

    }
}


class Person<A, B, C> {
    A a;
    B[] bList; // 等于光有定义却无法使用，建议用包装类，这样还有方法可以用
    // static C c;  无法使用static，因为static会导致jvm无法加载初始化



}
