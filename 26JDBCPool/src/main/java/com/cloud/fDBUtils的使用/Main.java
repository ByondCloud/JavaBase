package com.cloud.fDBUtils的使用;

import com.cloud.dDruid工具类.DruidUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/23
 * @Time 23:07
 */
public class Main {
    // 使用DBUtils

    // 返回多行数据
    @Test
    public  void testQueryMany() throws SQLException {
        // 得到连接
        Connection connection = DruidUtils.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from test.actor";

        // 执行sql语句，得到resultSet，封装到ArrayList集合中
        List<Actor> query = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class));

        for (Actor actor : query) {
            System.out.println(actor);
        }
        DruidUtils.close(connection);
    }
}
