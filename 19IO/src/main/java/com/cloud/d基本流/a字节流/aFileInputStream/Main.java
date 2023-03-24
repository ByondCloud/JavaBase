package com.cloud.d基本流.a字节流.aFileInputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 4:21
 */
public class Main {

    @Test
    public void method01() throws IOException {
        int readData = 0;
        String filePath = "e:\\hello.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        while ((readData = fileInputStream.read()) != -1) {
            System.out.print((char) readData);
        }

        fileInputStream.close();
    }

    @Test
    public void method02() throws IOException {

        byte[] buf = new byte[8]; //一次读取8个字节.
        int readLen = 0;

        String filePath = "e:\\hello.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);


        while ((readLen = fileInputStream.read(buf)) != -1) {
            // 从第0位开始，截取到读取到的位数
            System.out.println(new String(buf, 0, readLen));//显示
        }

        fileInputStream.close();

    }

}
