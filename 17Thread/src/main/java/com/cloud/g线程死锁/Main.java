package com.cloud.g线程死锁;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 2:21
 */
public class Main {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01(true);
        Thread01 thread011 = new Thread01(false);
        Thread thread1 = new Thread(thread01);

        Thread thread2 = new Thread(thread011);

        thread1.start();
        thread2.start();



    }
}

class Thread01 implements Runnable {

    boolean flag;

    public Thread01(boolean flag) {
        this.flag = flag;
    }

    static Object o1 = new Object();// 保证多线程，共享一个对象,这里使用static
    static Object o2 = new Object();

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "得到资源1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "得到资源2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "得到资源2");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "得到资源1");
                }
            }
        }
    }
}
