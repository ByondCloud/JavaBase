package com.cloud.a集合常见的方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 18:04
 */
public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        // 增
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);

        // 删
        list.remove(true); // 指定删除某个元素

        // 查看某个元素是否存在
        System.out.println(list.contains("jack"));//T

        // list长度
        System.out.println(list.size());//2

        // 判空
        System.out.println(list.isEmpty());//F

        // 清空list
        list.clear();



        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");

        // 添加list
        list.addAll(list2);

        // 查找多个元素是否都存在
        System.out.println(list.containsAll(list2)); // T

        // 删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
    }
}
