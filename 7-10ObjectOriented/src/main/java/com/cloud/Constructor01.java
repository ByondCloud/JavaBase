package com.cloud;

public class Constructor01 {
    public static void main(String[] args) {
        Person11 kk = new Person11("kk", "18");
        Person11 cloud = new Person11("cloud", "22");
        System.out.println(kk.compareTo(cloud));
    }

}
class Person11 {
    String name;
    String age;
    // 构造器本质也是一个方法
    // 构造器没有返回值，也不能写void
    // 构造器的名字和类名一致
    // String name, String age 是构造器的形参列表
    public Person11(String pname, String page) {
        System.out.println("构造器被调用，完成对象的属性初始化 ");
        name = pname;
        age = page;
    }

    public boolean compareTo(Person11 p) {
        return p.hashCode() == this.hashCode();
    }
}
