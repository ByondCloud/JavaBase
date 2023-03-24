package com.cloud.d基本流.b字符流.bFileWrite;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 6:39
 */
public class Main {

    @Test
    public void method01() throws IOException {
        String filePath = "e:\\hello.txt";

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write('P');
        fileWriter.write(new char[]{'+', '-', '*', '/'});
        fileWriter.write("同志们辛苦了");
        fileWriter.write("为人民服务", 0, 3); // 为人民

        fileWriter.close();
    }

}
