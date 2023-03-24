package com.cloud.e日期.bCalendar;

import java.util.Calendar;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 15:52
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1); // 因为从0开始
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
