
public class WrapperClasses {
    @SuppressWarnings({ "deprecation", "unused" })
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(8);   Deprecated syntax.
        Integer num1 = new Integer(num);   // Boxing  --> Assigning primitive to Wrapper class.

        num1 = num;   //Auto-Boxing.

        int num2 = num1; //Auto-Unboxing.

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 3);

        Double d = 3.45;
        Character ch = 'a';
        
    }
    
}
