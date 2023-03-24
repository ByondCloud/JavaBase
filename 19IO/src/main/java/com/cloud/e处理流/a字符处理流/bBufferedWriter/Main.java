package com.cloud.e处理流.a字符处理流.bBufferedWriter;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 7:05
 */
public class Main {

    @Test
    public void method01() throws IOException {
        String filePath = "e:\\hello.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.newLine(); // 插入换行符
        bufferedWriter.write("为中华之崛起而读书");
        bufferedWriter.newLine(); // 插入换行符
        bufferedWriter.write("———— 周恩来");

        bufferedWriter.close();
    }

}
