import java.sql.*;
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        // Load and Register the Driver.

        Class.forName("com.sql.cj.jdbc.Driver");


        // Establlish the connection

        
        DriverManager.getConnection(url, user, password);

    }
}
