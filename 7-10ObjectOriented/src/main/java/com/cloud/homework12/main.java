package com.cloud.homework12;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("学生1", '男', 12, 1);
        Student student2 = new Student("学生2", '女', 13, 2);
        Teacher teacher1 = new Teacher("老师1", '男', 40, 8);
        Teacher teacher2 = new Teacher("老师2", '女', 35, 3);
        Person[] people = {student1, student2, teacher1, teacher2};
        for (int i = 0; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if (people[i].getAge() < people[j].getAge()) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            people[i].method(people[i]);
            people[i].play();
            System.out.println("------------------------");
        }
    }


}

class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void play() {
        System.out.println("玩");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (this instanceof Person) {
            return getName() + "的信息:\n"
                    + "姓名:" + getName() + '\n'
                    + "年龄:" + getAge() + '\n'
                    + "性别:" + getSex() + '\n';
        }
        if (this instanceof Student) {
            return "学生的信息:\n"
                    + "姓名:" + getName() + '\n'
                    + "年龄:" + getAge() + '\n'
                    + "性别:" + getSex() + '\n';
        }
        return "有误";
    }
    public void method(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        }
        if (person instanceof Teacher) {
            ((Teacher) person).teach();
        }
    }
}

class Student extends Person{
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩足球");
    }

    @Override
    public String toString() {
        return super.toString() + "学号:" + stu_id;

    }
}

class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public void play() {
        System.out.println(getName() + "爱玩象棋");
    }

    @Override
    public String toString() {
        return super.toString() + "工龄:" + work_age;
    }
}
