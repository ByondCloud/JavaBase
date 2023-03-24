package com.cloud.homework04;

public class main {
    public static void main(String[] args) {
        manager wang = new manager("wang", 200, 30);
        wang.print();
    }

}

class Person {
    private String name;
    private double salary;
    private int day;

    public Person(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }
    public void print() {
        System.out.println("打印工资");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}

class manager extends Person {

    public manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void print() {
        System.out.println(1000 + getSalary() * getDay() * 1.2);
    }
}

class staff extends Person {

    public staff(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void print() {
        System.out.println(getSalary() * getDay());
    }
}
