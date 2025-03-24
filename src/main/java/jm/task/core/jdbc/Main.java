package jm.task.core.jdbc;

import antlr.Utils;
import com.mysql.cj.jdbc.ConnectionImpl;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.HibernateUtil;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        UserDao userDao = new UserDaoHibernateImpl();
        userDao.saveUser("Ivan", "Ivanov", (byte) 25);
        userDao.saveUser("Petr", "Petrov", (byte) 30);
        List<User> users = userDao.getAllUsers();


    }
}

