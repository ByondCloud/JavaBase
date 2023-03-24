package com.cloud.gHashMap.b遍历Map;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/20
 * @Time 21:16
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "小明");
        map.put(2, "小红");
        map.put(3, "小芳");


        // 增强for
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        // 迭代器
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(map.get(next));
        }

        // lambda
        map.forEach((integer, s) -> System.out.println(integer + "-" + s));

        // 获取values
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }


    }
}
