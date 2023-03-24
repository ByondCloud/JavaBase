package com.cloud;

public class 运算符 {

    public static void main(String[] args) {

        /*
        * 取余 %
        * */
        // % 取余 a % b --> a - a / b * b
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);


        /*
        * 自增
        * ++i: 先自增，后赋值
        * i++: 先赋值，再自增
        * */
        int i = 10;
        // j = i++ --> j = i; i = i + 1
        int j = i++;
        System.out.println("j = " + j);

        int x = 10;
        // y = ++x --> x = x + 1; y = x
        int y = ++x;
        System.out.println("y = " + y);


        /*经典面试题*/
        int a = 1;
        a = a++;
        // 结果是1,因为在i++的时候有一个临时变量temp
        // 【1】temp = a;
        // 【2】a = a + 1;
        // 【3】 a = temp;
        System.out.println(a);

        int b = 1;
        b = ++b;
        // 结果是2
        // 【1】b = b + 1;
        // 【2】temp = b;
        // 【3】b = temp;
        System.out.println(b);


        int i1 = 10;
        int i2 = 20;
        // 先赋值, 再自增
        int c = i1++;
        System.out.println("c = " + c); // c = 10
        System.out.println("i1 = " + i1); // i1 = 11
        c = --i2;
        System.out.println("c = " + c); // c = 19
        System.out.println("i2 = " + i2); // i2 = 19



        /*小作业*/
        // 1. 59天 = *星期*天？
        int day = 59;
        System.out.println("一共有" + day + "天");
        System.out.print(59 / 7 + "个星期");
        System.out.println("零" + 59 % 7 + "天");
        // 2. 234.5华氏度 = ？摄氏度
        double F = 234.5;
        double C = 5.0 / 9.0 * (F - 100);
        System.out.println(C);



    }


}
