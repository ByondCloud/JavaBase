package com.cloud.dClass常用方法.a关于类的方法;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 22:29
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("com.cloud.Cat");
        // 获取对象实例
        Object o = cls.newInstance();

        System.out.println(cls); // class com.cloud.Cat

        // 1.获取全类名
        System.out.println(cls.getName()); // com.cloud.Cat

        // 2.获取类名
        System.out.println(cls.getSimpleName()); //Cat

        // 3. 获取成员
        Field field = cls.getField("name");

        // 3. 获取所有成员属性，包括父类
        Field[] fields = cls.getFields();

        // 4. 获取本类所有成员属性
        Field[] declaredFields = cls.getDeclaredFields();

        // 5.获取所有方法，包括父类
        Method[] methods = cls.getMethods();

        // 6.获取本类所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();

        // 7.返回本类public构造器
        Constructor[] constructors = cls.getConstructors();

        // 8.返回所有构造器
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();

        // 9. 包名
        Package aPackage = cls.getPackage();

        // 10.取父类
        Class superclass = cls.getSuperclass();

        // 11.返回接口
        Class[] interfaces = cls.getInterfaces();

        // 12.返回注解
        Annotation[] annotations = cls.getAnnotations();


        // 包名
        System.out.println(cls.getPackage()); // package com.cloud

        // 全类名
        System.out.println(cls.getName()); // com.cloud.Cat


        // 给成员赋值
        field.set(o, "基霸猫");
        System.out.println(field.get(o)); // 基霸猫
    }
}
