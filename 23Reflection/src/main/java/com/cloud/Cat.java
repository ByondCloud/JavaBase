package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 21:26
 */
public class Cat {
    public String name = "小猫猫";
    public int id;

    public void go() {
        System.out.println("猫猫跑");
    }

    public void eat(String fish) {
        System.out.println(fish);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Cat() {
    }

    public Cat(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private Cat(int id) {
        this.id = id;
    }

}
