import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;

public class ConnectionUtil {
    public static Connection getConnection() {
        System.out.println("Getting connection");
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb", "root", "swapan-2021");
        } catch (Exception ex) {
            System.out.println("Error in getting connection  : " + ex.getMessage());
        }
        System.out.println("Returning connection: " + connection);
        return connection;
    }
}
