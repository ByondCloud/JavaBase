package com.cloud.fPreparedStatement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/20
 * @Time 19:09
 */
public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String admin_name = scanner.nextLine(); // 输入 【1' or】
        String admin_pwd = scanner.nextLine(); // 输入【or '1' = '1】

        Properties properties = new Properties();
        properties.load(new FileReader("resources\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select id, name, pwd from test.admin where name = ? and pwd = ?";


        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 给？赋值，第一个int参数填写第几个？ 第二个参数填写内容
        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_pwd);

        // 我们在上面PreparedStatement里已经预处理过了
        // 这里就不要再把sql传进去了，如果传进去会变成带？的sql语句去执行，一定会报sql语法错误
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt(1);
            System.out.println("id: " + id + " 登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
