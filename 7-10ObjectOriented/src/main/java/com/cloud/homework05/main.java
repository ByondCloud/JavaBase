package com.cloud.homework05;

public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.print();
    }
}

class Person {
    public int salary;

    public void print() {
        System.out.println(salary * 365);
    }
}

class Teacher extends Person {
    private int teachSalary = 100;

    @Override
    public void print() {
        System.out.println((salary + teachSalary) * 365);
    }
}
