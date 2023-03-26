package com.cloud.dResultSet结果集;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/17
 * @Time 10:02
 */
public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select id, name, sex, borndate from test.actor;");

        // 使用while循环取出数据
        while(resultSet.next()) {
            int id = resultSet.getInt(1); // 获取该行的第二列
            String name = resultSet.getString(2); // 获取到该行的第二列
            String sex = resultSet.getString(3); // 获取到该行的第三列
            Date date = resultSet.getDate(4);// 获取到该行的第四列
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        // 关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
