package com.cloud.b遍历list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 18:09
 */
public class Main {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList();
        collection.add("nick");
        collection.add("jack");
        collection.add("marry");

        // 方式一: 迭代器
        // 快捷键itit
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 方式二: for
        for (String s : collection) {
            System.out.println(s);
        }

        // 方式三 stream
        collection.stream().forEach(System.out::println);

        // 如果有下标可以用fori




    }
}
