package com.cloud.dClass常用方法.b关于成员的方法;

import java.lang.reflect.Field;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/24
 * @Time 9:47
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Class cls = Class.forName("com.cloud.Cat");
        // 获取对象实例
        Object o = cls.newInstance();

        Field field = cls.getField("name");

        // 1.给属性赋值
        field.set(o, "客服猫");

        // 2.获取值
        System.out.println(field.get(o)); // 客服猫

        // 3.获得修饰符 1.public  2.private  4.protected  8.static  16.final
        // 例如 public static 就是(1 + 8) = 9
        int modifiers = field.getModifiers();

        // 4. 返回类型
        System.out.println(field.getType()); // java.lang.String

        // 5. 返回属性名
        System.out.println(field.getName()); // name

    }
}
