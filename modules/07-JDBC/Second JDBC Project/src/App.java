import java.sql.*;

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

        // 1. Insert Record : 
        /*
            String sql = "INSERT INTO students(name, age) VALUES('Sarthak', 20)";
            int rows = statement.executeUpdate(sql);

            if(rows == 0){
                System.out.println("Unable to insert data.");
            }
            else{
                System.out.println("Data inserted Successfully.");
            }
        */

        // 2. Update Records : 
        /* 
            String sql = "UPDATE students SET name = 'Sanu' WHERE id = 3";
            int rowsAffected = statement.executeUpdate(sql);

            if(rowsAffected == 0){
                System.out.println("Something went wrong.");
            }
            else{
                System.out.println("Data Updated Successfully.");
            }
        */

        // 3. Retrieve/Fetch Records : 

        String sql = "SELECT * FROM students";
        ResultSet rs = statement.executeQuery(sql);

        System.out.println("id" + " Name" + " Age");
        while(rs.next()){
            // System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
        }
        
        // 4. Delete Records : 
        /*
            String sqll = "DELETE FROM students WHERE id = 4";
            int Res = statement.executeUpdate(sqll);
    
            if(Res == 0){
                System.out.println("Something went wrong.");
            }
            else{
                System.out.println("Record deleted Successfully.");
            }
        */

        // 5. All Operations using execute function :

        String sqll = "UPDATE students SET id = 4 WHERE name = 'Sarthak'";
        boolean status = statement.execute(sqll);

        if(status){
            System.out.println("Into the if block :");  // This block executes only when the query is of retrieving data (i.e. status = true).

            // Select/Retrieve operation :

            ResultSet rset = statement.getResultSet();
            System.out.println("id " + "name " + "age");
            while(rset.next()) {
                System.out.println(rset.getInt("id") +" " + rset.getString("name") + " " + rset.getInt("age"));                
            }

            rset.close();
        }
        else{
            System.out.println("Into the else block :"); // This block executes only when the query is not of retrieving data and it is of insertion, updation, or deletion (i.e. status = false).

            //Insert, Update, or Delete operations.
            int rows = statement.getUpdateCount();
            if(rows == 0){
                System.out.println("Operation Failed !!.");
            }
            else{
                System.out.println("operation Successfull.");
            }

        }
        
        // Close the Resources
        rs.close();
        statement.close(); 
        connect.close();
    }
}
