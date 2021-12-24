package com.xsliang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    private static final String driverUrl = "oracle.jdbc.driver.OracleDriver";

       private static final String url = "jdbc:oracle:thin:@localhost:1521:thinknovo";

       private static final String username = "think";

       private static final String password = "123456";

       public static Connection getConnection(){
           Connection connection = null;
           try {
               Class.forName(driverUrl);
               connection = DriverManager.getConnection(url, username, password);
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return connection;
       }

       // 测试Oracle连接是否成功
       public static void main(String[] args) {
           Connection connection = Test.getConnection();
           //List<UserInfo> list = new ArrayList<UserInfo>();

           try {
               Statement statement = connection.createStatement();
               ResultSet rs = statement.executeQuery("select * from IHR_JOB");
               while(rs.next()){
            	   System.out.println(rs.getInt(1));
//                   int id = rs.getInt(1);
//                   String name = rs.getString(2);
//                   String password = rs.getString(3);
//                   int sex = rs.getInt(4);
//                   String gif = rs.getString(5);
//                   Date date = rs.getDate(6);
//                   int type = rs.getInt(7);
//                   UserInfo info = new UserInfo();
//                   info.setUid(id);
//                   info.setUname(name);
//                   info.setUpassword(password);
//                   info.setUsex(sex==0?false:true);
//                   info.setUface(gif);
//                   info.setUregtime(date);
//                   info.setUtype(type);
//                   list.add(info);
               }


           } catch (SQLException e) {
               e.printStackTrace();
           }
//           for(UserInfo info:list){
//               System.out.println(info.getUname());
//           }
           System.out.println("连接成功："+connection);
       }
}
