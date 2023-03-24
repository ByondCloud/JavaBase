package com.cloud;

public class Method01 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.speak();
        person.cal01();

    }
}

class Person1 {
    String name;
    String age;

    public void speak() {
        System.out.println("我是傻逼");
    }

    public void cal01() {
        int res = 0;
        for (int i = 0; i <= 1000; i++) {
            res += i;
        }
        System.out.println("计算结果=" + res);
    }

}
