import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/db_college";

    private static final String USER = "root";

    private static final String PASSWORD = "manibharathi";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }

        return connection;
    }

}
