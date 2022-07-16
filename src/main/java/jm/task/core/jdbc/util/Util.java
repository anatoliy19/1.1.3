package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection connection;
    private static SessionFactory sessionFactory;

    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimeZone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true","root","admin");
        connection.setAutoCommit(false);
        return connection;
    }

    public Util() throws SQLException {
    }
}
