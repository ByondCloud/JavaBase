package com.cloud.homework14;

public class Test {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("我是A类");
    }
}
class B extends A {
    public B() {
        System.out.println("我是B类的无参构造");
    }
    public B(String name) {
        System.out.println(name + "我是B类的有参构造");
    }
}
class C extends B {
    public C(){
        // this和super只能同时执行一个！！！！！！
        this("hello");
        System.out.println("我是C类的无参构造");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是C类的有参构造函数");
    }
}
