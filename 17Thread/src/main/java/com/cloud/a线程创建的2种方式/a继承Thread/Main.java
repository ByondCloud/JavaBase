package com.cloud.a线程创建的2种方式.a继承Thread;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 6:50
 */
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.start();


    }
}


class Cat extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("cat");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
