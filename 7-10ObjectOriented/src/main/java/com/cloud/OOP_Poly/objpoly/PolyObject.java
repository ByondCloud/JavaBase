package com.cloud.OOP_Poly.objpoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();
        Cat cat = (Cat) animal;
        cat.eat();
    }
}

class Animal {
    public void cry() {
        System.out.println("动物在叫");
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("猫在叫");
    }

    public void eat() {
        System.out.println("猫猫吃鱼");
    }
}
