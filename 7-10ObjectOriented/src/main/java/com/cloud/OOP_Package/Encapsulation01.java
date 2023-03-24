package com.cloud.OOP_Package;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setSalary(30000);
        System.out.println(person.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary; // 工资


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // 写一个方法，用于返回属性信息
    public String info() {
        return name + age + salary;
    }

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
}
