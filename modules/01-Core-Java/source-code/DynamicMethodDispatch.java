class Computer{
    public void show(){
        System.out.println("I am Computer.");
    }
} 

class Laptop extends Computer{
    public void show(){
        System.out.println("I am  Laptop.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String Rgs[]){
        Computer obj = new Laptop(); 
        obj.show();   // It will call the show() method of Laptop class since the object obj of type Computer is assigned to Laptop class'
        // This will work only with the inheritance.    
    }
}
