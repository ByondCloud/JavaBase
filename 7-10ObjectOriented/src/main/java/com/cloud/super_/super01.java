package com.cloud.super_;

public class super01 {
    public static void main(String[] args) {
        C c = new C();
        c.cal();
        c.test();
    }
}


class A {
    public void cal() {
        System.out.println("A类的cal方法");
    }
}

class B extends A {
    public void cal() {
        System.out.println("B类的cal方法");
    }
}

class C extends B {
    public void test() {
        super.cal();
    }
}
