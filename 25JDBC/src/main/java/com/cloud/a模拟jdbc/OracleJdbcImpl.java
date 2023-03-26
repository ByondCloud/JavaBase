package com.cloud.a模拟jdbc;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/15
 * @Time 0:30
 */
public class OracleJdbcImpl implements JDBCInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到了oracle连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成了oracle的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
