package com.cloud.homework01;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Person kk = new Person("kk", 22, "Student");
        Person cloud = new Person("cloud", 18, "Engineer");
        Person byond = new Person("byond", 30, "architect");

        Person[] people = {kk, cloud, byond};

        for (int i = 0; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if (people[i].getAge() > people[j].getAge()) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

    }
}


class Person {
    private String name;
    private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
