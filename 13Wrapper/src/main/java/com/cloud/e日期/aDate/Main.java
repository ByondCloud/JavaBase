package com.cloud.e日期.aDate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 15:48
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(923555);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
