package com.cloud.b反射常用的方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 21:36
 */
public class Main {
    public static void main(String[] args) throws Exception{


        Class cls = Class.forName("com.cloud.Cat");
        Object o = cls.newInstance();

        // 执行反射类的方法
        cls.getMethod("go").invoke(o);

        // 获得反射类的成员【只有public才能获取到】
        System.out.println(cls.getField("name").get(o));

        // 获得无参构造器
        Constructor constructor = cls.getConstructor();
        Object o1 = constructor.newInstance();
        System.out.println(o1);

        // 获得有参构造器
        Constructor constructor1 = cls.getConstructor(String.class, int.class);
        Object cowCat = constructor1.newInstance("奶牛猫", 12);
        System.out.println(cowCat);

    }
}
