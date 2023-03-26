package com.cloud.dDruid工具类;


import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/22
 * @Time 1:18
 */
public class JDBCUtilsTest {

    @Test
    public void testDruidUtils() {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = DruidUtils.getConnection();
            // class com.alibaba.druid.pool.DruidPooledConnection
            // 实现类不一样，调用的都是Connection接口
            System.out.println(connection.getClass());
            String sql = "select * from test.account where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 200);
            resultSet = preparedStatement.executeQuery();
            connection.close();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int money = resultSet.getInt("money");
                System.out.println(id + "\t" + name + "\t" + money);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DruidUtils.close(connection, preparedStatement, resultSet);
        }
    }
}
