package com.cloud.d线程礼让和插入;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 8:41
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AA aa = new AA();
        Thread thread1 = new Thread(aa);
        Thread thread2 = new Thread(aa);

        thread1.start();
        thread2.start();

        Thread.yield(); // 线程礼让
        thread1.join(); // thread1优先插入

    }
}

class AA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
