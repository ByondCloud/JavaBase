package com.cloud.f通过构造器创建.a爆破;

import com.cloud.Cat;

import java.lang.reflect.Constructor;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/24
 * @Time 10:52
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.cloud.Cat");

        // 得到非公构造器
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(int.class);
        // 爆破
        declaredConstructor.setAccessible(true);

        Object o = declaredConstructor.newInstance(101);
        System.out.println(o);

    }
}
