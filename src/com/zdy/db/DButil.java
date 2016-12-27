package com.zdy.db;

import java.sql.*;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class DButil {
    private static final String URL="jdbc:mysql://localhost:3306/zzucs201202";
    private static final String USER="root";
    private static final String PASSWORD="root";
    private static Connection connection=null;
    static {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            connection=DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }

   /*public static void main(String[] args) throws Exception {
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from pwd");
        while(resultSet.next()){
            System.out.println(resultSet.getString("no")+","+resultSet.getString("pwd"));
        }
    }*/
}
