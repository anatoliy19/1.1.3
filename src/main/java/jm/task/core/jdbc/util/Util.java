package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {

     public static Connection connection;
     private static final String Connection_Url = "jdbc:mysql://localhost:3306/test?" +
             "&serverTimeZone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true";
     private static final String User = "root";
     private static final String Password = "admin";

    public static Connection getConnection() {

        try
        {
           Connection connection = DriverManager.getConnection( Connection_Url,User,Password);
           connection.setAutoCommit(false);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
