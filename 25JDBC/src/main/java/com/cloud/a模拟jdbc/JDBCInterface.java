package com.cloud.a模拟jdbc;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/15
 * @Time 0:19
 */
public interface JDBCInterface {

    // 连接
    public Object getConnection();

    // crud
    public void crud();

    // 关闭连接
    public void close();


}
