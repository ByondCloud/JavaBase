package com.cloud.aString.eStringBuffer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/19
 * @Time 13:51
 */
public class Exercise {
    public static void main(String[] args) {
        String price = "12345678.9";
        StringBuffer sb = new StringBuffer(price);
        for (int i = price.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
