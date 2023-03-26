package com.cloud.e土办法封装;


import com.cloud.dDruid工具类.DruidUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/23
 * @Time 22:37
 */
public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String sql = "select * from test.actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            connection = DruidUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date borndate = resultSet.getDate(4);
                String phone = resultSet.getString(5);
                actors.add(new Actor(id, name, sex, borndate, phone));
            }
            System.out.println(actors);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(connection, preparedStatement, resultSet);
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Actor {
    private int id;
    private String name;
    private String sex;
    private Date borndate;
    private String phone;
}
