package com.cloud.b枚举的第二种用法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/18
 * @Time 19:39
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SUMMER);
    }
}

enum  Season2 {//类

    //如果使用了enum 来实现枚举类
    //1. 使用关键字 enum 替代 class
    //2. public static final Season SPRING = new Season("春天", "温暖") 直接使用
    //   SPRING("春天", "温暖") 解读 常量名(实参列表)
    //3. 如果有多个常量(对象)， 使用 ,号间隔即可
    //4. 如果使用enum 来实现枚举，要求将定义常量对象，写在前面
    //5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 ()
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");

    private String name;
    private String desc;//描述

    // 默认就是私有，因此如果需要使用需要创造get、set方法
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
