package com.cloud.h返回单行单列的情况;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/25
 * @Time 3:40
 */
public class Main {
    // 假如我只需要actor中的name属性，我们不需要把整条记录都拉出来
    @Test
    public void testQueryOnlyName() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("resources/druid.properties"));
        Connection connection = DruidDataSourceFactory.createDataSource(properties).getConnection();
        String sql = "select name from test.actor where id = ?";
        QueryRunner queryRunner = new QueryRunner();
        Object query = queryRunner.query(connection, sql, new ScalarHandler(), 1);
        System.out.println(query);
        connection.close();
    }
}
