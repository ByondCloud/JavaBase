package com.cloud.OOP_Poly;

public class Poly {
    public static void main(String[] args) {
        Master master = new Master("我");
        master.feed(new Dog("dog"), new Bone("骨头"));
    }
}


class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Food {

    public Bone(String name) {
        super(name);
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println(name + animal.getName() + food.getName());
    }
}
