package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection connection;

    public static Connection getConnection() {

        String conn = "jdbc:mysql://localhost:3306/test?&serverTimeZone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true";
        try (Connection connection = DriverManager.getConnection( conn,"root","admin"))
        {
           return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
