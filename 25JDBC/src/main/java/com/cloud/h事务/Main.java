package com.cloud.h事务;


import com.cloud.gJDBC工具类.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/21
 * @Time 6:10
 */
public class Main {
    public static void main(String[] args) {
        Connection connection = JDBCUtils.getConnection(); // 拿到这个连接，事务是默认提交的，执行一条语句提交一次

        PreparedStatement preparedStatement = null;
        String sql = "update test.account set money = money - 100 where id = 100";
        String sql2 = "update test.account set money = money + 100 where id = 200";
        try {

            // 如果需要关闭自动提交，那么需要这么一句话
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

//            int i = 1 / 0;

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit(); // 提交事务
        } catch (SQLException e) {
            // 如果执行出现异常，可以在这里回滚
            try {
                connection.rollback(); // 回滚事务
            } catch (SQLException ex) {
                ex.printStackTrace();
            }


            e.printStackTrace();
        } finally {
            JDBCUtils.close(preparedStatement, connection);
        }
    }
}
