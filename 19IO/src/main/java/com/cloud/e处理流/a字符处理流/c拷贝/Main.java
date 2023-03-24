package com.cloud.e处理流.a字符处理流.c拷贝;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 7:25
 */
public class Main {

    @Test
    public void method01() throws IOException {
        String filePath = "e:\\hello.txt";
        String outputPath = "f:\\gnmd.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
        if (new File(outputPath).exists()) {
            new File(outputPath).createNewFile();
        }
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
