package com.cloud.a模拟jdbc;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/15
 * @Time 0:27
 */
public class TestJDBC {
    public static void main(String[] args) {
        JDBCInterface mySqlJdbc = new MySqlJdbcImpl();
        mySqlJdbc.getConnection();
        mySqlJdbc.crud();
        mySqlJdbc.close();
    }
}
