package com.cloud.object;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            return ((Person) obj).name.equals(this.name) && ((Person) obj).age == this.age && ((Person) obj).gender == this.gender;
        }
        return false;
    }
}



