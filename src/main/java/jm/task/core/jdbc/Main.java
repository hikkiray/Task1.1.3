package jm.task.core.jdbc;

import antlr.Utils;
import com.mysql.cj.jdbc.ConnectionImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        Util.getConnection();
        UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
        dao.createUsersTable();

        dao.saveUser("Artem", "Podolyak", (byte) 22);
        dao.saveUser("Ivan", "Krivich", (byte) 22);
        dao.saveUser("Alexey", "Yalovets", (byte) 22);
        dao.saveUser("Nikita", "Parygin", (byte) 27);

        dao.removeUserById(1);
        dao.getAllUsers();
        dao.cleanUsersTable();
        dao.dropUsersTable();
    }
}

