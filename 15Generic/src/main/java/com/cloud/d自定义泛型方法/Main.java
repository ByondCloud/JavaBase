package com.cloud.d自定义泛型方法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 6:33
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.fly(100, "abc");
    }
}


class Cat {
    public<T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
