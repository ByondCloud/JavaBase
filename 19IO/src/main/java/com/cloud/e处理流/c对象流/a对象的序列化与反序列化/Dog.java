package com.cloud.e处理流.c对象流.a对象的序列化与反序列化;

import java.io.Serializable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:19
 */
public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
