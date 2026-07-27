class DataTypes{
    public static void main(String [] args){
        int num = 128;
        // types of int
        // byte by = 127;
        // short sh = 555;
        // long l = 1234567890L;

        // decimal types
        // float f = 3.142f;
        double d = 3.1422133414411;

        char c = 'A';  // Always use single quotes for char

        boolean b = true;

        System.out.println("Integer value: " + num);
        System.out.println("decimal value: " + d);
        System.out.println("Character value: " + c);
        System.out.println("Boolean value: " + b);

        //Literals
        int a = 100;
        a = 0b101; // binary literal
        System.out.println("Binary literal value: " + a);

        a = 0x1A; // hexadecimal literal
        System.out.println("Hexadecimal literal value: " + a);

        a = 10_000_000; // decimal literal with underscore
        System.out.println("Decimal literal value: " + a);

        char ch = 'a';
        ch++;
        System.out.println("Character after increment: " + ch);

        
    }
}