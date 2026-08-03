class Alien{
    void show(){
        System.out.println("Hello Aliens...");
    }
}
public class LocalVariableTypeInference {
    // var e  = 10;    // This will also not valid since var only works with local variables.
    public static void main(String[] args) {
        
        int a = 8;
        var b = 9;

        System.out.println("Sum : " + (int)(a + b));

        // int c;   // Valid with data type.

        // var d;   // Not valid, var should be initialized.

        @SuppressWarnings("unused")
        var str  = "Khushi";

        var nums = new int[5];
        nums[0] = 1;

        var al1 = new Alien();
        al1.show();

    }
}
