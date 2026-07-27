import tools.*;

public class Packages {
    public static void main(String args[]){
        VeryCalcAdv obj1 = new VeryCalcAdv();
        int r1 = obj1.add(5, 4);
        int r2 = obj1.sub(7, 3);
        int r3 = obj1.mul(5, 4);
        int r4 = obj1.div(20, 4);
        int r5 = obj1.mod(5, 4);
        double r6 = obj1.pow(2, 4);

        System.out.println("sum : " + r1);
        System.out.println("sub : " + r2);
        System.out.println("product : " + r3);
        System.out.println("qouteint : " + r4);
        System.out.println("mod : " + r5);
        System.out.println("power : " + r6);
    }
}
