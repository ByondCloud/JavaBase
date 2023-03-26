package com.cloud.gJDBC工具类;

import com.mysql.cj.protocol.Resultset;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/21
 * @Time 5:35
 */
public class Main {
    // 使用JDBCUtils
    @Test
    public void testDML() {
        // 1. 得到连接
        Connection connection = JDBCUtils.getConnection();
        // 2. 组织一个sql
        String sql = "update test.actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 2);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(preparedStatement, connection);
        }

    }

}


