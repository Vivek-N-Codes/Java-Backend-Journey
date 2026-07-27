public class MyString {
    public static void main(String [] args){
        String name = new String();
        name = "Khushi";

        // String name = new String("Khushi");

        String girl = "Khushi";

        boolean check = (name == girl);
        System.out.println(check);   // result will be true. (String constant pool)

        // String methods:
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Mishra"));

        // StringBuffer:
        StringBuffer s1 = new StringBuffer("Khushi");
        System.out.println(s1);

        System.out.println(s1.capacity());  // default capacity is 16 + string length
        System.out.println(s1.length());    // length = 6

        s1.ensureCapacity(100);

        /*
            Note :- StringBuilder is another class equivalent to the StringBuffer but the difference is
            StringBuilder is not * Thread Safe *.
        */
    }
}
