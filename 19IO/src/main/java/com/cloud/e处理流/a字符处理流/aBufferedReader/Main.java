package com.cloud.e处理流.a字符处理流.aBufferedReader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 6:59
 */
public class Main {

    // 你可以理解为是FileReader的包装类
    // 提供了很多方法供我们使用好比int和Integer的区别

    @Test
    public void method01() throws IOException {
        String filePath = "e:\\hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
