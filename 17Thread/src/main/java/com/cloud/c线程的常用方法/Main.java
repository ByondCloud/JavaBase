package com.cloud.c线程的常用方法;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 8:21
 */
public class Main {
    public static void main(String[] args) {
        AA aa = new AA();
        Thread thread = new Thread(aa);
        thread.setName("王八");              // 设置线程名
        String name = thread.getName();     // 获取线程名
        thread.setPriority(0);              // 设置线程优先级 0最低 10最高
        int priority = thread.getPriority();// 获取线程优先级
        thread.interrupt();                 // 这个不是强制停止，而是通知线程停止
                                            // 至于何时停止，如果线程处于中断、阻塞，会直接停止
                                            // 如果线程处于运行，则改变标识符

    }
}

class AA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程执行中");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
