package com.cloud.b使用jdbc操作数据库;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2022/11/15
 * @Time 4:53
 */
public class main {

    @Test
    public void connect01() throws SQLException {
        // 1. 注册驱动
        Driver driver = new Driver();
        // 2. 得到连接
        // SQL连接本质就是socket连接
        String url = "jdbc:mysql://localhost:3306/test";

        // 将用户名和密码放入properties
        Properties properties = new Properties();
        properties.setProperty("user", "root"); // 这里的key【user】不能随便改，是固定的
        properties.setProperty("password", "123456"); // 这里的key【password】不能随便改，是固定的

        // 将url和properties放到connect方法中连接数据库
        Connection connect = driver.connect(url, properties);

        // 3. 执行sql
        String sql = "insert into test.actor values(null, '刘德华', '男', '1970-01-01', '7345999')";
        // 用于执行静态sql语句并返回其生成结果的对象
        Statement statement = connect.createStatement();
        // 返回受影响的行数
        int i = statement.executeUpdate(sql);

        // 4. 关闭连接
        statement.close();
        connect.close();
    }





    // 通过上面的方式，我们会发现还是不够灵活
    // 我们可以通过反射来达到动态加载
    @Test
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 1.通过反射来得到驱动
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        // 2. 得到连接
        // SQL连接本质就是socket连接
        String url = "jdbc:mysql://localhost:3306/test";

        // 将用户名和密码放入properties
        Properties properties = new Properties();
        properties.setProperty("user", "root"); // 这里的key【user】不能随便改，是固定的
        properties.setProperty("password", "123456"); // 这里的key【password】不能随便改，是固定的

        // 将url和properties放到connect方法中连接数据库
        Connection connect = driver.connect(url, properties);

        // 3. 执行sql
        String sql = "insert into test.actor values(null, '刘德华', '男', '1970-01-01', '7345999')";
        // 用于执行静态sql语句并返回其生成结果的对象
        Statement statement = connect.createStatement();
        // 返回受影响的行数
        int i = statement.executeUpdate(sql);

        // 4. 关闭连接
        statement.close();
        connect.close();

    }





    // 我们也可以通过DriverManager来替代driver进行统一管理
    @Test
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 1. 通过反射来得到驱动
        Class<Driver> driver = (Class<Driver>) Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver1 = driver.newInstance();

        // 2. 创建url，user，password
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        DriverManager.registerDriver(driver1); // 这一步其实可以省略，在反射的时候已经注册了
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }





    // 使用Class.forName 自动完成注册驱动，简化代码
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        // 可以进入Driver源码去查看，静态帮我们创建了Driver，因此不用像上面那样注册一个Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        Properties properties = new Properties();
        properties.setProperty("user", "root"); // 这里的key【user】不能随便改，是固定的
        properties.setProperty("password", "123456"); // 这里的key【password】不能随便改，是固定的

        String url = "jdbc:mysql://localhost:3306/test";
        Connection connection = DriverManager.getConnection(url, properties);
        System.out.println(connection);

    }


    // 其实反射也可以取消掉
    // 因为从jdk1.5以后使用了jdbc4，不在需要显式调用class.forname() 注册驱动
    // 而是自动调用驱动jar包下的META-INF\services\java.sql.Driver文本中的类名称去注册
    @Test
    public void connect05() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "123456";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    // 最终版本，从properties中读取
    @Test
    public void connect06() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader("resources/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

}
