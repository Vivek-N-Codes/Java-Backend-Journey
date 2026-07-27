class Calc {
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCalc extends Calc{             // AdvCalc---is a---Calc.

    // public int add(int n1, int n2){      //Method Overriding. 
    //     return n1 + n2 + 1;                     
    // }

    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc{       // Multi-Level Inheritance.
    public double pow(int n1, int n2){
        return Math.pow(n1, n2);
    }
    public int mod(int n1, int n2){
        return n1 % n2;
    }
}
public class Inheritance {
    public static void main(String args[]){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 4);
        int r2 = obj.sub(5, 2);
        int r3 = obj.mul(5, 4);
        int r4 = obj.div(15, 3);
        int r5 = obj.mod(5, 4);
        double r6 = obj.pow(4, 3);

        System.out.println("sum : " + r1);
        System.out.println("sub : " + r2);
        System.out.println("product : " + r3);
        System.out.println("qouteint : " + r4);
        System.out.println("mod : " + r5);
        System.out.println("power : " + r6);
    }
}
// Java does not support to Multiple Inheritance with classes.
    //     class A{}
    //     class B{}
    //     class C extends A, B{}    =>  Not Valid.
    //     class C extends A extends B{}    =>  Not Valid.
