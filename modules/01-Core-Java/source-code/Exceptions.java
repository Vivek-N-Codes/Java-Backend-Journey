class VivekException extends Exception{
    public VivekException(String message){
        super(message);
    }
}
class Pqr{
    public void show() throws ClassNotFoundException{
        Class.forName("Monster");
    }
}
public class Exceptions {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int n = 12;
        // int d = 0;

        int d = 4;

        String str =  null;

        int arr[] = new int[5];
        arr[0] = 1; arr[4] = 5;

        int i = 18;
        int j = 20;

        try{
            System.out.println("Quoteint is : " + n / d);   // Throws exception of dividing by zero.

            System.out.println("Element 1 ==> " + arr[0]);
            // System.out.println(arr[5]);   // Throws exception of array index out of bound.

            // System.out.println("Length of string is : " + str.length()); 

            int result = i / j;
            System.out.println("Result is : " + result);
            if(result == 0){
                throw new ArithmeticException(/* You can print a message here. */);
            }

        }
        catch(ArithmeticException e){
            // System.out.println("Invalid Operation. " + e);   // e is for printing the exception.
            System.out.println("can not divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bound.");
        }
        catch(Exception e){
            System.out.println("Something went wrong." + e);     // For catching any unknown exception will arise.
        }

        System.out.println("Thank you.");

        try{
            int a = 5;
            if( a == 5){
                throw new VivekException("I dont want to print 5.");
            }
        }
        catch(VivekException e){
            System.out.println(e);
        }

        Pqr obj = new Pqr();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Unable to find the class.");
        }

    }
}
