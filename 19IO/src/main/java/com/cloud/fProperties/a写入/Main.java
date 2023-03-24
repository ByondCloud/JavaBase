package com.cloud.fProperties.a写入;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/22
 * @Time 9:03
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("user", "汤姆");
        properties.setProperty("password", "888888");

        properties.store(new FileWriter("e:\\mysql.properties"), null);
//        properties.store(new FileOutputStream("e:\\mysql.properties"), null);
    }
}
