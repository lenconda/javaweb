package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    private static String DB_URL = "jdbc:sqlite:/Users/lenconda/workspace/javaweb/project7/bookstore.db";
    private static String DB_DRIVER = "org.sqlite.JDBC";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException exception) {
            System.out.println("Class not found!");
            exception.printStackTrace();
        } catch (SQLException exception) {
            System.out.println("Database connect error!");
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
    }
}
