package com.cloud.d基本流.b字符流.aFileReader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 6:31
 */
public class Main {

    // 一个一个字符的读取
    @Test
    public void method01() throws IOException {
        int tempData;
        String filePath = "e:\\hello.txt";
        FileReader fileReader = new FileReader(filePath);
        while ((tempData = fileReader.read()) != -1) {
            System.out.print((char) tempData);
        }
        fileReader.close();
    }

    // 通过数组读取
    @Test
    public void method02() throws IOException {
        int length;
        char[] tempData = new char[8];
        String filePath = "e:\\hello.txt";
        FileReader fileReader = new FileReader(filePath);
        while ((length = fileReader.read(tempData)) != -1) {
            System.out.print(new String(tempData, 0, length));
        }
        fileReader.close();
    }

}
