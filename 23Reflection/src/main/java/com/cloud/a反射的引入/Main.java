package com.cloud.a反射的引入;

import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 21:25
 */
public class Main {
    public static void main(String[] args) throws Exception {

        String path = "com.cloud.Cat";

        Class cls = Class.forName(path);
        // 创建反射对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass()); // com.cloud.Cat

        // 创建方法对象
        Method go = cls.getMethod("go");
        // 执行方法
        go.invoke(o); // 猫猫跑


    }
}
