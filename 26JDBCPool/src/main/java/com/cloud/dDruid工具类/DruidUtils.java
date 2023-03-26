package com.cloud.dDruid工具类;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/22
 * @Time 1:11
 */
public class DruidUtils {
    private static DataSource ds;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("26JDBCPool\\src\\main\\resources\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取数据库连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    // 释放数据库连接
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection connection, Statement statement) {
        try {
            connection.close();
            statement.close();
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
