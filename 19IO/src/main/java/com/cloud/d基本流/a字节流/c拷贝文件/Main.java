package com.cloud.d基本流.a字节流.c拷贝文件;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 6:16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\test.png";
        String outputPath = "f:\\copy.png";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath, true);
        byte[] temp = new byte[50];
        int length;

        while ((length = fileInputStream.read(temp)) != -1) {
            fileOutputStream.write(temp, 0, length);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }


    // 一个一个读，效率极低
    @Test
    public void readOne() throws IOException {
        String filePath = "d:\\test.png";
        String outputPath = "f:\\copy.png";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath, true);
        int temp;

        while ((temp = fileInputStream.read()) != -1) {
            fileOutputStream.write(temp);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
