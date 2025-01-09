package Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {
    private static final String SERVER = "jdbc:mysql://localhost/DB_UAS_1123007?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            connection = logOn();
        }
        return connection;
    }

    private static Connection logOn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successful connection");
            return DriverManager.getConnection(SERVER, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            System.out.println("Failed connection: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.err);
            System.out.println("JDBC, ODBC driver not found");
        }
        return null;
    }

    public void logOff() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Closed connection");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        getConnection();
    }
}
