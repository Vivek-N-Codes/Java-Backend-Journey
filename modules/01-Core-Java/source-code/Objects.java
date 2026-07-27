class Calculator{
    public int add(int num1, int num2){
        System.out.println("Addition is : ");
        return num1 + num2;
    }
}
public class Objects {
    public static void main(String[] args){
        int num1 = 15, num2 = 23;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}