package projects.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {
	private static final String HOST = "localhost"; 
    private static final String USER = "projects";
    private static final String PASSWORD = "handsome1";
    private static final String PORT = "3306"; 
    private static final String SCHEMA = "projects";

    public static Connection getConnection() {
        String uri = "jdbc:mysql://" + HOST + ":" + PORT + "/" + SCHEMA;
        try {
            Connection connection = DriverManager.getConnection(uri, USER, PASSWORD);
            System.out.println("Connection successful!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            throw new DbException(e);
        }
    }
}
