import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException {
        // Load and Register the Driver.

        Class.forName("com.mysql.cj.jdbc.Driver");

        // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());     // Another Way of Registering the Driver.


        // Establlish the connection

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root123";

        Connection connect = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement statement = connect.createStatement();

        // Execute the Query 
        
        // 1. Insert
        String sql = "INSERT INTO students(name, age) VALUES ('Ash', 21)";
        int rowsaffected = statement.executeUpdate(sql);
        
        // Process the reuslt 
        if(rowsaffected == 0){
            System.out.println("Unable to insert the data.");
        }
        else{
            System.out.println("Data inserted successfully.");
        }

        

        // Close the connection
        statement.close();
        connect.close();
    }
}
