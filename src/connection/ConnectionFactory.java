package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Kardex?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Andrey@08012001";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    

    public static void closeConnection(Connection con) {
        try {
            if(con != null) con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
