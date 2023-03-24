package com.cloud.e处理流.e转换流.a乱码;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:41
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ansi.txt"; // 这个文本编码改成ANSI
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容: " + s);
        br.close();
    }
}
