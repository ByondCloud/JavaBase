package com.cloud.e获取Class类对象;

import com.cloud.Cat;

import java.io.Serializable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/23
 * @Time 22:46
 */
public class Main {
    public static void main(String[] args) throws Exception {

         // 方式一：通过类全名
        Class cls = Class.forName("com.cloud.Cat");

        // 方式二：通过具体的类
        Class<Cat> catClass = Cat.class;

        // 方式三：通过某个实例
        String s = new String();
        // 这里是一个疑问点，值得后续深挖
        Class<? extends String> aClass = s.getClass();

        // 方式四：通过类加载器
        Cat cat = new Cat();
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass1 = classLoader.loadClass("com.cloud.Cat");
        System.out.println(aClass1.getName());

        // 基本数据类型获取Class
        Class<Integer> integerClass = int.class;

        // 基本数据类型对应的包装类
        Class<Integer> type = Integer.TYPE;



        // 其他类型获取Class
        Class<String> stringClass = String.class; // 外部类
        Class<Serializable> cls2 = Serializable.class;//接口
        Class<Integer[]> cls3 = Integer[].class;//数组
        Class<Thread.State> cls6 = Thread.State.class; // enum




    }
}


