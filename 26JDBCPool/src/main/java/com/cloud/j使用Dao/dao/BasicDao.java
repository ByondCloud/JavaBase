package com.cloud.j使用Dao.dao;

import com.cloud.j使用Dao.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/27
 * @Time 1:42
 */
public class BasicDao<T> {

   private QueryRunner queryRunner = new QueryRunner();

   // 更新、删除、修改
   public int update(String sql, Object... parameters) {
       Connection connection = null;
       try {
           connection = JDBCUtilsByDruid.getConnection();
           int update = queryRunner.update(connection, sql, parameters);
           return update;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } finally {
           JDBCUtilsByDruid.close(connection);
       }
   }

   // 返回多条查询
   public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) {
       Connection connection = null;
       try {
           connection = JDBCUtilsByDruid.getConnection();
           List<T> query = queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
           return query;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } finally {
           JDBCUtilsByDruid.close(connection);
       }
   }

   // 返回单条查询
   public T querySingle(String sql, Class<T> clazz, Object... parameters) {
       Connection connection = null;

       try {
           connection = JDBCUtilsByDruid.getConnection();
           T query = queryRunner.query(connection, sql, new BeanHandler<T>(clazz), parameters);
           return query;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } finally {
           JDBCUtilsByDruid.close(connection);
       }
   }

   // 返回单值
   public Object queryScalar(String sql, Object... parameters) {
       Connection connection = null;

       try {
           connection = JDBCUtilsByDruid.getConnection();
           Object query = queryRunner.query(connection, sql, new ScalarHandler(), parameters);
           return query;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } finally {
           JDBCUtilsByDruid.close(connection);
       }
   }



}
