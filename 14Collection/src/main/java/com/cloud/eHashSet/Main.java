package com.cloud.eHashSet;

import java.util.HashSet;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 19:30
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.forEach(System.out::println);
    }
}
