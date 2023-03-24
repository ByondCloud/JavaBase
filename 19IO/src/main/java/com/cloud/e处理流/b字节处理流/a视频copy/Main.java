package com.cloud.e处理流.b字节处理流.a视频copy;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 7:33
 */
public class Main {


    @Test
    public void method01() throws IOException {
        String filePath = "e:\\test.mkv";
        String outputPath = "f:\\copy.mkv";

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputPath));

        byte[] temp = new byte[1024];
        int length;
        while ((length = bufferedInputStream.read(temp)) != -1) {
            bufferedOutputStream.write(temp, 0, length);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}
