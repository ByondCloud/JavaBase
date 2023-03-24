package com.cloud.OOP_Poly;

public class Poly02 {
    public static void main(String[] args) {
        Base base = new Sub();
        String str = "12";
        System.out.println(base instanceof Sub);
        System.out.println(str instanceof Object);
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}
