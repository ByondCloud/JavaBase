package com.cloud.i批处理;



import org.junit.Test;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/21
 * @Time 7:37
 */
public class Main {
    // 都2022年了，还在用传统方式写代码
    @Test
    public void Tradition() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into test.admin(name, pwd) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666" + i);
            preparedStatement.executeUpdate();
        }

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        preparedStatement.close();
        connection.close();
    }

    @Test
    // 用了批处理方式来提高速度【最快】
    public void batch() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into test.admin(name, pwd) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack");
            preparedStatement.setString(2, "666");
            // 将sql加入批处理
            preparedStatement.addBatch();
            // 当有1k条的时候，再发给mysql执行
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                System.out.println("执行批处理");
                // 清空批量
                preparedStatement.clearBatch();
            }
        }

        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        preparedStatement.close();
        connection.close();
    }

    @Test
    // 把所有的语句执行完再提交的方式【会快一些】
    public void myTest() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        String sql = "insert into test.admin(name, pwd) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack");
            preparedStatement.setString(2, "666");
            preparedStatement.execute();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        connection.commit();
        preparedStatement.close();
        connection.close();
    }





}
