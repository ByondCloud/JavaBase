package com.cloud.d基本流.a字节流.bFileOutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 5:25
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hello.txt";
        // 没true是覆盖，有true是追加
        FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
        fileOutputStream.write('H');

        String str = "你好中文互联网";
        fileOutputStream.write(str.getBytes());

        fileOutputStream.close();
    }

}
