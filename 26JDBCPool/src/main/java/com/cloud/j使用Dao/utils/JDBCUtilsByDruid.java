package com.cloud.j使用Dao.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/25
 * @Time 5:32
 */
public class JDBCUtilsByDruid {
    private static DataSource datasource;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("resources/druid.properties"));
            datasource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
