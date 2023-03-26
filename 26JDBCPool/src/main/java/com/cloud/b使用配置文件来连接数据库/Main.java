package com.cloud.b使用配置文件来连接数据库;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/21
 * @Time 21:48
 */

// 这里需要注意，c3p0-config.xml文件需要放在src目录下,才可连接成功
public class Main {

    @Test
    public void testC3P0() throws Exception{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("cloud");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }

}

