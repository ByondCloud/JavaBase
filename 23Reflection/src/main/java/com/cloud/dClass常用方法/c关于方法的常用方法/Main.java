package com.cloud.dClass常用方法.c关于方法的常用方法;

import java.lang.reflect.Method;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/24
 * @Time 9:54
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("com.cloud.Cat");
        // 获取对象实例
        Object o = cls.newInstance();

        Method method = cls.getMethod("eat", String.class);
        // 1.获得修饰符 1.public  2.private  4.protected  8.static  16.final
        // 例如 public static 就是(1 + 8) = 9
        int modifiers = method.getModifiers();

        // 2.获取返回类型
        System.out.println(method.getReturnType()); // void

        // 3.获取方法名
        System.out.println(method.getName()); // eat

        // 4.返回参数类型数组
        Class<?>[] parameterTypes = method.getParameterTypes();

        // 执行方法
        method.invoke(o, "鲤鱼");


    }
}
