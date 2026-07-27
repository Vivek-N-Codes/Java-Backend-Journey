class A{
    public A(){
        super();
        System.out.println("In A.");
    }
    public A(int n){
        super();
        System.out.println("In int A = " + n);
    }
}
class B extends A{
    public B(){
        super(7);   // executes parameterized constructor of the super class.
        System.out.println("In B.");
    }
    public B(int n){
        this();   // execute constructor of itself
        System.out.println("In int B = " + n);
    }
}

public class ThisSuper {
    public static void main(String args[]){
        B obj = new B();
        System.out.println(obj);    //Reference address.
    }
    
}
