import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class App {
    public static void main(String[] args) throws Exception {
        // Load / Register Driver 
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create Connection
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user ="root";
        String pass = "root123";

        Connection connect = DriverManager.getConnection(url, user, pass);

        // Create Statement 
            Statement statement = connect.createStatement();

        // 1. Update Records : 
        /* 
            // Execute the Query
            String sql = "UPDATE students SET name = 'Sanu' WHERE id = 3";
            int rowsAffected = statement.executeUpdate(sql);

            // Process the Result
            if(rowsAffected == 0){
                System.out.println("Something went wrong.");
            }
            else{
                System.out.println("Data Updated Successfully.");
            }
        */

        // 2. Retrieve/Fetch Records : 

        String sql = "SELECT name FROM students WHERE id = 1";
        


        // Close the 
        statement.close(); 
        connect.close();
    }
}
