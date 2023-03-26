package com.cloud.gJDBC工具类;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    // 1. 定义相关属性
    private static String user;
    private static String password;
    private static String url;
    private static String driver;


    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("resources\\mysql.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            // 在实际开发中，会把编译异常转为运行异常，这样调用者可以捕获该异常，也可以默认处理
            throw new RuntimeException(e);
        }
    }

    // 连接数据库，返回一个connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 关闭相关资源
    public static void close(ResultSet set, Statement statement, Connection connection) {
        try {
            set.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Statement statement, Connection connection) {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
