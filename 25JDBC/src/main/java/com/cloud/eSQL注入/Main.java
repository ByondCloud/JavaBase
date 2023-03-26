package com.cloud.eSQL注入;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/18
 * @Time 12:07
 */
public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        // 让用户输入用户名和密码

        Scanner scanner = new Scanner(System.in);
        String admin_name = scanner.nextLine(); // 输入 【1' or】
        String admin_pwd = scanner.nextLine(); // 输入【or '1' = '1】


        Properties properties = new Properties();
        properties.load(new FileReader("resources\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select name, pwd from test.admin where name = '" + admin_name + "' and pwd = '" + admin_pwd + "'");
        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("请检查用户密码是否正确 用户名:" + admin_name + "\t" + "密码:" + admin_pwd);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
