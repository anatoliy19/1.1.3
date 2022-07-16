package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

         UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

         userDao.dropUsersTable();
         userDao.createUsersTable();
         userDao.saveUser("John","Mike", (byte) 31);
         userDao.removeUserById(0);
         userDao.getAllUsers();
         userDao.cleanUsersTable();

    }
}
