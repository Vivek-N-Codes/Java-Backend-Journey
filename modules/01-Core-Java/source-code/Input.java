// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        int num;
        Scanner sc = new Scanner(System.in);
        try{
            num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{   // Executes irrespective of exception i.e always executes.
            sc.close();   // always close your resources in finally block.
        }
            

        


        // bf.close();
    }
}
