@FunctionalInterface
interface A{
    void show(int x);
    // void run();   // Will throw compiler error since the Annotation is there.
}
interface B{
    void run(int i, int j);
}
interface C{
    int add(int n1,  int n2);
}

public class LambdaFn{
    public static void main(String[] args) {
        A obj = (x) -> System.out.println("In a show " + x);  // for Lambda function the interface must be the functional interface.
        obj.show(5);

        B obj1 = (i, j) -> {
            System.out.println("Running...");
            System.out.println("Calculating power...");
            System.out.println(Math.pow(i, j));
        };
        obj1.run(5, 2);

        C obj2 = (n1, n2) -> {
            System.out.println("Adding.....");
            return n1 + n2;
        };
        System.out.println(obj2.add(7, 8));

        C obj3 = (x, y) -> x + y;   // x + y is by default a return statement.

        System.out.println( "Sum is : " + obj3.add(5, 7));
    }
}
