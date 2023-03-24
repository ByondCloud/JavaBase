package com.cloud;

public class Object01 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.color = "白色";
        cat1.name="小白";
        cat1.age = 3;
        System.out.println(cat1.name);
    }
}

class Cat {
    String name;
    Integer age;
    String color;
}
