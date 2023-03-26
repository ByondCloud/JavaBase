package com.cloud.cDruid的使用;

import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;


import javax.sql.DataSource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/22
 * @Time 0:49
 */

// 测试druid
public class Main {

    // 1. 引入druid的jar包
    // 2. 编写druid.properties配置文件
    // 3. 读取配置文件
    @Test
    public void testDruid() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("resources/druid.properties"));

        // 4. 创建一个指定参数的数据库连接池【Druid连接池】
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);


        long l = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

    }

}
