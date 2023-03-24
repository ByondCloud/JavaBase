package com.cloud.homework10;


public class main {
    public static void main(String[] args) {
        Doctor test1 = new Doctor("1", 2, "3", '男', 5);
        Doctor test2 = new Doctor("1", 3, "3", '男', 5);
        System.out.println(test1.equals(test2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Doctor) {
            if (((Doctor) obj).name == name && ((Doctor) obj).age == age && ((Doctor) obj).job == job && ((Doctor) obj).gender == gender && ((Doctor) obj).salary == salary) {
                return true;
            }
        }
        return false;
    }
}
