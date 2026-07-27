/*  
    class ----> class  => extends
    interface ----> class  => implements
    interface ----> interface  => extends
*/

interface X {
    int age = 59;                   // Final and static by default.
    String area = " Mumbai";   

    void show();     // Public and abstract by default.
    void config();
}
interface Z {
    void run();
}
interface P extends X{}  // Interface can extends properties of other interface.

class Y implements X, Z{   // Must have to implement the all abstract methods of interface.  ----[ Multiple Inheritance]----
    public void show(){   
        System.out.println("IN Y show...");
    }
    public void config(){
        System.out.println("In Y config.");
    }
    public void run(){                  // Must implement all methods of all musltiple iterfaces it is implementing.
        System.out.println("Running in class Y");   
    }
}

// class Q{}
// interface R extends Q{}  // interface can not extend class, interface can only extend super interface.

public class Interfaces {
    public static void main(String[] args) {
        X obj;   // We can create a reference, it's valid but can not create object of interface.
        // obj = new X();   // can not instantiate interface.
        obj = new Y(); // valid.
        obj.show();
        obj.config(); 
        // obj.run();   // object of X and accessing method of interface Z is not valid.
        Z obj1 = new Y();
        obj1.run();  // valid using object of interface in which run is there.
    }
}
