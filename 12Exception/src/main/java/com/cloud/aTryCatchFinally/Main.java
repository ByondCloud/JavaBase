package com.cloud.aTryCatchFinally;

import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/18
 * @Time 20:42
 */
public class Main {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("abc");
        }catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("程序结束");
        }


    }
}
