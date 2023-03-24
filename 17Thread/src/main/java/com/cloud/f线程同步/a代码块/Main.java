package com.cloud.f线程同步.a代码块;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 2:02
 */
public class Main {
    public static void main(String[] args) {

        new Thread(new Thread01()).start();
        new Thread(new Thread01()).start();
        new Thread(new Thread01()).start();

    }
}


class Thread01 implements Runnable {

    private static Integer num = 100;

    @Override
    public void run() {

        synchronized(this) { // 或者锁num
            while (true) {
                if (num <= 0) {
                    System.out.println("结束");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " " + (--num));
            }
        }
    }
}
