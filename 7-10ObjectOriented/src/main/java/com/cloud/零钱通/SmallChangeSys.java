package com.cloud.零钱通;

import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String details = "------------零钱通明细----------";

        do {
            System.out.println("------------零钱通菜单----------");
            System.out.println("       1. 零钱通明细");
            System.out.println("       2. 收益入账");
            System.out.println("       3. 消费");
            System.out.println("       4. 退出");
            System.out.println("------------------------------");

            String i = scanner.next();


            if ("1".equals(i)) {
                System.out.println(details);
            } else if ("2".equals(i)) {
                System.out.println("入账");
            } else if ("3".equals(i)) {
                System.out.println("消费");
            } else if ("4".equals(i)) {
                System.out.println("退出");
                flag = false;
            } else {
                System.out.println(i);
                System.out.println("输入有误，请重新输入");
            }

        } while (flag);
        System.out.println("退出零钱通");
    }
}
