package com.cloud.零钱通;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<A> as = new ArrayList<>();
        boolean flag = true;
        BigDecimal money = new BigDecimal(100);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------------零钱通菜单----------");
            System.out.println("       1. 零钱通明细");
            System.out.println("       2. 收益入账");
            System.out.println("       3. 消费");
            System.out.println("       4. 退出");
            System.out.println("------------------------------");

            String i = scanner.next();


            if ("1".equals(i)) {
                System.out.println("------------零钱通明细----------");
                for (int j = 0; j < as.size(); j++) {
                    System.out.println(as.get(j));
                }
            } else if ("2".equals(i)) {
                System.out.println("入账");
                String title = scanner.next();
                BigDecimal price = scanner.nextBigDecimal();
                money = money.add(price);
                A a = new A(title, "+", price, new Date(),money);
                as.add(a);
            } else if ("3".equals(i)) {
                System.out.println("消费");
                String title = scanner.next();
                BigDecimal price = scanner.nextBigDecimal();
                money = money.subtract(price);
                A a = new A(title, "-", price, new Date(), money);
                as.add(a);

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

class A {
    private String title;
    private String sign;
    private BigDecimal price;
    private Date time;
    private BigDecimal over;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getOver() {
        return over;
    }

    public void setOver(BigDecimal over) {
        this.over = over;
    }

    public A(String title, String sign, BigDecimal price, Date time, BigDecimal over) {
        this.title = title;
        this.sign = sign;
        this.price = price;
        this.time = time;
        this.over = over;
    }

    public A() {
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return title + "\t" + sign + price + "\t" + sdf.format(time) + "\t" + over;
    }
}

