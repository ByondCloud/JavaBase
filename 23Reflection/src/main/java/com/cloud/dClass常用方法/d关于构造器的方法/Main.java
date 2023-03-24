package com.cloud.dClass常用方法.d关于构造器的方法;

import com.cloud.Cat;

import java.lang.reflect.Constructor;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/24
 * @Time 10:39
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("com.cloud.Cat");
        // 获取对象实例
        Object o = cls.newInstance();

        // 1. 通过有参构造创建对象【无参构造就把参数去掉就是了】
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Cat jb = (Cat) constructor.newInstance("基霸猫", 11);
        jb.eat("鲈鱼");

        // 2.获得修饰符 1.public  2.private  4.protected  8.static  16.final
        // 例如 public static 就是(1 + 8) = 9
        int modifiers = constructor.getModifiers();

        // 3.获得构造器全类名
        System.out.println(constructor.getName()); // com.cloud.Cat

        // 4.返回参数类型
        Class[] parameterTypes = constructor.getParameterTypes();

    }
}
