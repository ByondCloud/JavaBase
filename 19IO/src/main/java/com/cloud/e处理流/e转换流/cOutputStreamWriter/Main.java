package com.cloud.e处理流.e转换流.cOutputStreamWriter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 8:52
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ansi.txt"; // 这个文本编码是ANSI

        // 注意转换流指定编码
        OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream(filePath, true), "gbk");

        BufferedWriter bufferedWriter = new BufferedWriter(gbk);
        bufferedWriter.newLine();
        bufferedWriter.write("你好新中国");
        bufferedWriter.close();
    }
}
