package com.cloud.c操作数据库练习;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/15
 * @Time 18:37
 */
public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader("25JDBC\\src\\main\\resources\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        statement.executeUpdate("create table news (id int auto_increment primary key, content varchar(255));");
        statement.executeUpdate("insert into news values (null, '第一条新闻');");
        statement.executeUpdate("insert into news values (null, '第二条新闻');");
        statement.executeUpdate("insert into news values (null, '第三条新闻');");
        statement.executeUpdate("insert into news values (null, '第四条新闻');");
        statement.executeUpdate("insert into news values (null, '第五条新闻');");
        statement.executeUpdate("update news set content = '修改第一条记录' where id = 1;");
        statement.executeUpdate("delete from news where id = 3;");

        statement.close();
        connection.close();
    }
}
