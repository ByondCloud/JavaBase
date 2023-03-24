package com.cloud.homework03;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        Professor 肖建飞 = new Professor("肖建飞", 33);
        System.out.println(肖建飞.introduce());
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;


    public String introduce() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

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
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
}

class Professor extends Teacher{

    public Professor(String name, int age) {
        super(name, age, "教授", 1.3);
    }
}

class AssociateProfessor extends Teacher {

    public AssociateProfessor(String name, int age) {
        super(name, age, "副教授", 1.2);
    }
}

class Lecturer extends Teacher {

    public Lecturer(String name, int age) {
        super(name, age, "讲师", 1.1);
    }
}
