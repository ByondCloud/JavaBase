package com.cloud.homework11;

public class main {
    public static void main(String[] args) {
        Person person = new Student();
        person.eat();
        Student student = (Student) person;
        student.eat();


    }
}
class Person {
    public void run() {
        System.out.println("person run");
    }
    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends Person {
    public void run() {
        System.out.println("student run");
    }
    public void eat() {
        System.out.println("student eat");
    }
}
