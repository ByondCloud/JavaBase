package com.cloud.fProperties.b读取;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 12:42
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\mysql.properties";

        Properties properties = new Properties();

        properties.load(new FileReader(filePath));

        properties.list(System.out);

        String user = properties.getProperty("user");
        System.out.println(user);

    }
}
