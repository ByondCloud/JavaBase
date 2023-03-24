package com.cloud.e处理流.e转换流.bInputStreamReader;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:46
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ansi.txt"; // 这个文本编码是ANSI
        // InputStreamReader 这个就是转换流
        // 就是用字节流读取，用转换流转成GBK编码，然后用处理流处理文本
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "gbk");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
