package com.cloud.Override;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal {
    protected Object cry() {
        System.out.println("哈哈");
        return "哈哈";
    }
}

class Dog extends Animal {
    public String cry() {
        System.out.println("汪汪");
        return "汪汪";
    }
}
