package com.cloud.g使用DBUtils和druid返回单行记录;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/25
 * @Time 2:25
 */
public class Main {
    @Test
    public void testQuerySingle() throws Exception {
        // 1. 获得properties
        Properties properties = new Properties();
        properties.load(new FileReader("resources/druid.properties"));

        // 2. 得到连接
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        // 3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        // 4. sql
        String sql = "select * from test.actor where id = ?";

        // 5. 传入一个BeanHandler，返回单个对象
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 10);
        // 如果返回为空，则查询不到
        System.out.println(actor);
        // 6. 因为queryRunner在底层会帮我们把预处理关闭，我们不用手动关闭
        connection.close();
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Actor {
    private int id;
    private String name;
    private String sex;
    private LocalDateTime borndate;
    private String phone;
}
