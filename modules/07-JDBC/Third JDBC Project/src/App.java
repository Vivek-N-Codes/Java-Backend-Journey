import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection connect = null;
        Statement statement = null;
        try {
        // Load & Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create Connection
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String pass = "root123";
        connect = DriverManager.getConnection(url, user, pass);

        // Create Statement
        statement = connect.createStatement();

        // Execute Query

        String sql = "INSERT INTO students(name, age) VALUES('Ashish', 21)";
        int rowsAffected = statement.executeUpdate(sql);

        // Process the Result
        if(rowsAffected == 0){
            System.out.println("Something went Wrong.");
        }
        else{
            System.out.println("Record Inserted Successfully.");
        }
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
        // Close Resources
        statement.close();
        connect.close();
        }

    }
}
