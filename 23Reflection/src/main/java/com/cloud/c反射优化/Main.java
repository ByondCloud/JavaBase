package com.cloud.c反射优化;

import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 22:23
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("com.cloud.Cat");
        Object o = cls.newInstance();

        // 获取方法
        Method go = cls.getMethod("go");

        // 关闭访问检查
        go.setAccessible(true);

        go.invoke(o);


    }
}
