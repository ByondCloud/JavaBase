package com.cloud.a泛型的使用;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 6:08
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person(1);
        System.out.println(person.s.getClass());

    }
}


class Person<E> {
    E s;


    public Person(E s) {
        this.s = s;
    }
}
