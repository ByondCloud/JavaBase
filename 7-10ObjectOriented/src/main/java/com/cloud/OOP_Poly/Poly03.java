package com.cloud.OOP_Poly;

public class Poly03 {
    public static void main(String[] args) {
        A a =new B();
        System.out.println(a.sum());
    }

}
class A {
    public int i = 10;
    public int sum() {
        return geti() + 10;
    }
    public int geti() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int geti() {
        return i;
    }
}
