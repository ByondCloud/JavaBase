package com.cloud.gHashMap.a常用方法;

import java.util.HashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/20
 * @Time 17:29
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "小明");
        map.put(2, "小红");
        map.put(3, "小芳");
        map.put(4, null);

        // 获取key中的数据
        System.out.println(map.get(1));

        // 删除
        map.remove(4);
        map.remove(2, "小红");

        // 获取个数
        System.out.println(map.size());

        // 查询是否存在
        System.out.println(map.containsKey(1));


        // 清空map
        map.clear();

        System.out.println(map.toString());
    }
}
