package com.cloud.a连接池初见;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;


import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/21
 * @Time 20:59
 */
public class Main {

    public void TestC3P0() throws Exception{
        // 创建一个数据源
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        // 2. 通过配置获取相关信息
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        // 给数据源comboPooledDataSource 设置相关的参数
        // 连接管理是由comboPooledDataSource来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        // 设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);

        // 初始化10个连接，如果还有连接可以涨，一直涨到50个连接
        // 如果第51个连接过来连，那么就需要等待
        // 最大连接数
        comboPooledDataSource.setMaxPoolSize(50);

        // 连接
        Connection connection = comboPooledDataSource.getConnection();// 核心方法
        System.out.println("连接成功");
        connection.close();


    }
    @Test
    public void TestTime() throws Exception{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setInitialPoolSize(10);
        comboPooledDataSource.setMaxPoolSize(50);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        comboPooledDataSource.close();

    }


}
