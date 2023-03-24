package com.cloud.e日期.dInstant;


import java.time.Instant;
import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 17:51
 */
public class Main {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Date date = Date.from(now);
        System.out.println(date);
        Instant instant = date.toInstant();

        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
