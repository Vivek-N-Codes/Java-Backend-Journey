abstract class Car{   // Abstract class may or may not have abstract methods. 
    public abstract void drive();   //Abstact method can only be declared in abstract class & there is no implementation for it in this class but could be implemented in the child class.
    public void playMusic(){
        System.out.println("Music is Playing...");
    }
}

class WagonR extends Car{      //Concrete Class. 
    public void drive(){         // Extended class must have to implement all the abstract methods of parent class.
        System.out.println("Driving...");
    }
} 

public class AbstractKeyword {
    public static void main(String[] args) {
        // Car obj = new Car();    // Abstarct class can not be instantiate.
        // obj.playMusic();

        WagonR obj = new WagonR();
        obj.drive();
        obj.playMusic();

        // WagonR obj1 = new Car();  // can not convert the object into abstract class.

        Car obj1 = new WagonR();  // Valid.
        System.out.print("For obj1 : ");
        obj1.drive();


    }
}
