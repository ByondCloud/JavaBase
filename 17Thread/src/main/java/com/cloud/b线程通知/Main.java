package com.cloud.b线程通知;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/21
 * @Time 7:06
 */
public class Main {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aa.setFlag(false);

    }
}

class AA extends Thread {

    // 设置一个变量
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("线程执行中");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
