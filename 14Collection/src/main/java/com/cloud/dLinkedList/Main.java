package com.cloud.dLinkedList;

import java.util.LinkedList;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 19:23
 */
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        Integer integer = list.removeFirst();

        Integer first = list.getFirst();
        Integer last = list.getLast();

        list.forEach(System.out::println);

    }
}
